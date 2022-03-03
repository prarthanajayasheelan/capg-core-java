package savable;

public interface Save {

	
	static final boolean SAVESTATUS=true ;
	abstract void saveDetails();



	default void setSaveLocation()
	{
	System.out.println("save location set");
	}
	}
