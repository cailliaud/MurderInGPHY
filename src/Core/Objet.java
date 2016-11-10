package Core;

public class Objet extends EnigmaItem {
	private int slotSize;
	
	public Objet(String name, int slotSize ) {
		super(name);
		this.slotSize=slotSize;
		// TODO Auto-generated constructor stub
	}
	
	public int getSlotSize(){
		return slotSize;
	}

	public void setslotSize(int newSize){
		slotSize=newSize;
	}
}
