//RMI

// AddServerIntf.java

import java.rmi.*;
public interface AddServerIntf extends Remote{
    double add(double d1, double d2) throws RemoteException;
}

// AddServerImpl.java

import java.rmi.*;
import java.rmi.server.*;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf{
    public AddServerImpl() throws RemoteException{

    }
    public double add(double d1, double d2) throws RemoteException{
        return d1+d2;
    }
}

// AddServer.java

import java.rmi.*;
import java.net.*;

public class AddServer{
        public static void main(String[] args){
        try{
            AddServerImpl obj=new AddServerImpl();
            Naming.rebind("AddServer", obj);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

// AddClient.java

import java.rmi.*;
public class AddClient{
    public static void main(String[] args){
        try{
            String url1 = "rmi://" + args[0] + "/AddServer";
            AddServerIntf obj1 = (AddServerIntf)Naming.lookup(url1);
            
            sopln("first no."+args[1]);
            double d1=Double.valueOf(args[1]).doubleValue();

            sopln("second no."+args[2]);
            double d2=Double.valueOf(args[1]).doubleValue();

            sopln("sum:" + obj.add(d1,d2));
        }
        catch(){

        }
    }
}



