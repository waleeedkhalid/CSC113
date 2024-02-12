package question_7;

public class VendingMachine {
	Sweet[] slist;
	int ns;
	Drink[] dlist;
	int nd;

	public VendingMachine(int sweetsSize){
	slist= new Sweet[sweetsSize];
	ns=0;
	}

	public boolean depositSweet(Sweet slist[]) {
		for(int i = 0; i < slist.length; i++) {			
			this.slist[i] = new Sweet(slist[i].getName(), slist[i].getprice());
			ns++;
		}
		return true;
	}
	
	public int priceOfdrink(){
		int total=0;
		//line 1
		for(int i = 0; i < nd; i ++) {
			//line 2
			total += dlist[i].getprice();
		}
		return total;
		
	}
	
	public String toString() {
		String Sweets = "";
		for(int i = 0; i < ns; i++) {
			Sweets += slist[i].getName() + ", ";
		}
		
		return Sweets;
	}
}
