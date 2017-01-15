package api;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface MessageBoard extends Remote {
	
	public void newMessage(String text) throws RemoteException;
	public List<String> listMessages() throws RemoteException;
	public void register(Notifiable n) throws RemoteException;
}
