package Storage;

public abstract class Storage {
	
	Data d = new Data();
	abstract void persistent_storage();
	abstract void capacity();
}
