package Core;

public class PhysicalObject extends EnigmaItem {
	private int slotSize;
	
	public PhysicalObject(String name, int slotSize ) {
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
