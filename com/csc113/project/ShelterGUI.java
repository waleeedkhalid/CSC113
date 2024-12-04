package com.csc113.project;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class ShelterGUI extends JFrame {
	private Shelter shelter;
    private JTextField nameField, ageField, extraField1, extraField2, shelterNameField;
    private JComboBox<String> petTypeBox;
    private AdoptionFrame adoptionFrame;
    private JPanel shelterPanel;
    private String genderField;

    public ShelterGUI() {
        super("Pet Shelter Management System");
        StartFrame();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 400);
        
        setVisible(true);
    }

    public void StartFrame() {
    	shelter = new Shelter("Shelter");
        adoptionFrame = new AdoptionFrame(shelter, this);
        
        setLayout(new BorderLayout());
        shelterPanel = createShelterPanel();
        JPanel inputPanel = createInputPanel();
        JPanel controlPanel = createControlPanel();
        

        JPanel northPanel = new JPanel(new BorderLayout());
        northPanel.add(shelterPanel, BorderLayout.NORTH);
        northPanel.add(inputPanel, BorderLayout.CENTER);
        northPanel.add(controlPanel, BorderLayout.SOUTH);
       
        
        add(northPanel, BorderLayout.CENTER);
    }

    public JPanel createShelterPanel() {
        JPanel shelterPanel = new JPanel(new FlowLayout());
        shelterPanel.setBorder(BorderFactory.createTitledBorder("Shelter Information"));
        shelterPanel.setBackground(new Color(245, 245, 245));

        shelterPanel.add(new JLabel("Shelter Name:"));
        shelterNameField = new JTextField(20);
        shelterPanel.add(shelterNameField);
        
        return shelterPanel;
    }

    public JPanel createInputPanel() {
        JPanel inputPanel = new JPanel(new GridLayout(9,1));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Add Pet"));
        inputPanel.setBackground(new Color(245, 245, 245));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField(15);
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField(2);
        inputPanel.add(ageField);

        inputPanel.add(new JLabel("Gender:"));
        
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        
        maleButton.setSelected(true);
        
        inputPanel.add(maleButton);
        maleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				genderField = "Male";
			}
		});
        
        inputPanel.add(femaleButton);
        femaleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				genderField = "Female";
			}
		});
        

        inputPanel.add(new JLabel("Type (Dog/Cat/Parrot):"));
        petTypeBox = new JComboBox<>(new String[]{"Dog", "Cat", "Parrot"});
        inputPanel.add(petTypeBox);

        inputPanel.add(new JLabel("(Size/Color/TalkingAbility):"));
        extraField1 = new JTextField(20);
        inputPanel.add(extraField1);
        
        inputPanel.add(new JLabel("(Breed/Trait/Species):"));
        extraField2 = new JTextField(20);
        inputPanel.add(extraField2);
        
        JButton addButton = new JButton("Add Pet");
        addButton.addActionListener(e -> addPet(e));
        inputPanel.add(addButton);
        
        JButton adoptButton = new JButton("Adopt");
        adoptButton.addActionListener(e -> {
        	try {
				openAdoptionFrame();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
        });
        inputPanel.add(adoptButton);

        return inputPanel;
    }

    public JPanel createControlPanel() {
        JPanel controlPanel = new JPanel(new GridLayout(1,2));
        controlPanel.setBorder(BorderFactory.createTitledBorder("Controls"));
        controlPanel.setBackground(new Color(245, 245, 245));


        JButton saveButton = new JButton("Save to File");
        saveButton.addActionListener(e -> {
			try {
				savePetsToFile(this.shelter);
				JOptionPane.showMessageDialog(this, "Pets are saved !");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
        controlPanel.add(saveButton);

        JButton loadButton = new JButton("Load from File");
        loadButton.addActionListener(e -> {
			try {
				loadPetsFromFile(this.shelter);
				JOptionPane.showMessageDialog(this, "Pets are loadded !");
			} catch (IOException | PetException e1) {
				e1.printStackTrace();
			}
		});
        controlPanel.add(loadButton);

        return controlPanel;
    }
   
    public void addPet(ActionEvent e) {
    	String shelterName = shelterNameField.getText();
        if (!shelterName.isEmpty()) {
            shelter.setName(shelterName);
            shelterNameField.setEnabled(false); 
        } else {
            JOptionPane.showMessageDialog(this, "Please Enter The Shelter Name");
            return;
        }
        
        try {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String gender = genderField;
            String type = (String) petTypeBox.getSelectedItem();
            String extra1 = extraField1.getText();
            String extra2 = extraField2.getText();

            Pet pet = createPet(name, age, gender, type, extra1, extra2);
            if (shelter.addPet(pet)) {
                JOptionPane.showMessageDialog(this, name + " added to " + shelterName + " shelter.");
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Shelter is Full.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Wrong Input: " + ex.getMessage());
        }
    }

    public Pet createPet(String name, int age, String gender, String type, String extra, String extra2) throws PetException {
        String namePet = nameField.getText();
        int agePet = Integer.parseInt(ageField.getText());
        String genderPet = genderField;
        String typePet = (String) petTypeBox.getSelectedItem();
        Pet pet = null;

        if (type.equals("Dog")) {
            String size = extraField1.getText();
            String breed = extraField2.getText();
            pet = new Dog(name, age, gender, size, breed);
        } else if (type.equals("Cat")) {
            String color = extraField1.getText();
            String trait = extraField2.getText();
            pet = new Cat(name, age, gender, color, trait);
        } else if (type.equals("Parrot")) {
            boolean talkingAbility = Boolean.parseBoolean(extraField1.getText());
            String species = extraField2.getText();
            pet = new Parrot(name, age, gender, talkingAbility, species);
        } else
    		throw new PetException("Unknown Pet Type: " + type);
        return pet;
    }
    
    public void clearFields() {
        nameField.setText("");
        ageField.setText("");
        extraField1.setText("");
        extraField2.setText("");
    }
    
    
	public static void savePetsToFile(Shelter shelter) throws IOException {
//		File f = new File("pets.txt");
//		FileOutputStream fout = new FileOutputStream(f, true);
//		ObjectOutputStream oos = new ObjectOutputStream(fout);
//		
//		oos.writeObject(pet);
//		
//		oos.close();
		
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects.dat"))) {
            for(int i = 0; i < shelter.getPetscount(); i++) {
            	oos.writeObject(shelter.getPet(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void loadPetsFromFile(Shelter shelter) throws IOException, PetException {
		File f = new File("pets.txt");
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fin);
		
		PrintWriter pw = new PrintWriter("out.txt");
		
		int count = 0;
		
		try {
		
			while(true) {
				Pet p = (Pet) ois.readObject();
				shelter.addPet(p);
				pw.println(p.toString());
				count++;
			}
		} catch(EOFException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		pw.println("Total Pets: " + count);
		ois.close();
	}

    public void openAdoptionFrame() {
    	if(shelter == null) {
            JOptionPane.showMessageDialog(this, "Please Enter The Shelter Name");
    		return;
    	}
        adoptionFrame.updatePetsArray(shelter.getAllPets());
        adoptionFrame.setVisible(true);
        setVisible(false);
    }
}

class AdoptionFrame extends JFrame {
    private JTextField searchField;
    private JTextArea petsListArea;
    private Shelter shelter;
    private ShelterGUI sheltergui;
    private JComboBox<String> petSelectMenu;

    public AdoptionFrame(Shelter shelter, ShelterGUI sheltergui) {
        super("Adopt Pet");
        this.shelter = shelter;
        this.sheltergui = sheltergui;

        setLayout(new BorderLayout());
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create select menu and adopt button
        petSelectMenu = new JComboBox<>();
        updatePetSelectMenu();
        JButton adoptButton = new JButton("Adopt");
        adoptButton.addActionListener(e -> adoptPet());

        // Search Panel
        JPanel searchPanel = new JPanel(new FlowLayout());
        searchPanel.add(new JLabel("Select Pet:"));
        searchPanel.add(petSelectMenu);
        searchPanel.add(adoptButton);

        // Pets List Area
        petsListArea = new JTextArea();
        petsListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(petsListArea);

        // Add Another Pet Button
        JButton addAnotherPetButton = new JButton("Add AnothePet");
        addAnotherPetButton.addActionListener(e -> {
        	setVisible(false);
        	this.sheltergui.setVisible(true);
        });

        // Add components to the frame
        add(searchPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(addAnotherPetButton, BorderLayout.SOUTH);

        updatePetsArray(shelter.getAllPets());
    }

    private void updatePetSelectMenu() {
        petSelectMenu.removeAllItems();
        for (Pet pet : shelter.getAllPets()) {
            petSelectMenu.addItem(pet.getName());
        }
    }

    public void updatePetsArray(Pet[] pets) {
        StringBuilder result = new StringBuilder();
        for (Pet pet : pets) {
            result.append(pet.toString()).append("\n");
        }
        petsListArea.setText(result.toString());
        updatePetSelectMenu(); // Update select menu with latest pets
    }

    public void adoptPet() {
        String selectedPetName = (String) petSelectMenu.getSelectedItem();
        if (selectedPetName == null) {
            JOptionPane.showMessageDialog(this, "Please select a pet to adopt.");
            return;
        }

        int petIndex = shelter.searchPet(selectedPetName);
        if (petIndex == -1 || petIndex >= shelter.getAllPets().length) {
            JOptionPane.showMessageDialog(this, "Pet not found or invalid index.");
            return;
        }

        Pet petToAdopt = shelter.getAllPets()[petIndex];
        if (shelter.adoptPet(petToAdopt)) {
            JOptionPane.showMessageDialog(this, selectedPetName + " has been adopted.");
            updatePetsArray(shelter.getAllPets());
        } else {
            JOptionPane.showMessageDialog(this, "Unable to adopt pet.");
        }
    }
}

