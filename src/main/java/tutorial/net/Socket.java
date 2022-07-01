package tutorial.net;


import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.SocketChannel;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.security.PrivilegedAction;
import java.net.*;

public class Socket  {

    java.net.Socket socket = null;
    public Socket(java.net.Proxy proxy) {
        socket = new java.net.Socket(proxy);
    }

    public Socket(String host, int port) throws java.net.UnknownHostException, IOException{
        socket = new java.net.Socket(host, port);
    }

    public Socket(java.net.InetAddress address, int port) throws IOException {
        socket =new java.net.Socket(address, port);
    }

    public Socket(String host, int port, java.net.InetAddress localAddr,
                  int localPort) throws IOException {

        socket = new java.net.Socket(host, port, localAddr, localPort);
    }


	
	public void connect(java.net.SocketAddress endpoint, int timeout) throws IOException {
		socket.connect(endpoint, timeout);
	}	

	public void bind(java.net.SocketAddress bindpoint) throws IOException {
		socket.bind(bindpoint);
	}

	public java.net.SocketAddress getRemoteSocketAddress() {
		return socket.getRemoteSocketAddress();
	}
	public java.net.SocketAddress getLocalSocketAddress() {
        return socket.getLocalSocketAddress() ;
    }
     public java.nio.channels.SocketChannel getChannel() {
        return socket.getChannel();
    }

    public InputStream getInputStream() throws IOException {
    	return socket.getInputStream();
    }
    public OutputStream getOutputStream() throws IOException {
    	return socket.getOutputStream();
    }


    public synchronized void close() throws IOException {
        socket.close();
    }

     
    public void connect(java.net.SocketAddress endpoint) throws IOException {
         socket.connect(endpoint);
    }
    public InetAddress getInetAddress() {
        return socket.getInetAddress();
    }
    public InetAddress getLocalAddress() {
          return socket.getLocalAddress();
    }
    public int getPort() {
          return socket.getPort();
    }
    public int getLocalPort() {
          return socket.getLocalPort();
    }
    public void setTcpNoDelay(boolean on) throws SocketException {
        socket.setTcpNoDelay(on);
    }
    public boolean getTcpNoDelay() throws SocketException {
        return socket.getTcpNoDelay();
    }
    public void setSoLinger(boolean on, int linger) throws SocketException {
        socket.setSoLinger(on, linger);
     }
    public int getSoLinger() throws SocketException {
        return socket.getSoLinger();
     }
    public void sendUrgentData (int data) throws IOException  {
        socket.sendUrgentData(data);
     }
    public void setOOBInline(boolean on) throws SocketException {
        socket.setOOBInline(on);
     }
    public boolean getOOBInline() throws SocketException {
        return socket.getOOBInline();
     }

    public synchronized void setSoTimeout(int timeout) throws SocketException { 
        socket.setSoTimeout(timeout);
    }
    public synchronized int getSoTimeout() throws SocketException { 
         return socket.getSoTimeout();
    }
    public synchronized void setSendBufferSize(int size)  throws SocketException {
        socket.setSendBufferSize(size);
    
    }
    public synchronized int getSendBufferSize() throws SocketException { 
        return getSendBufferSize();
    }
    public synchronized void setReceiveBufferSize(int size)  throws SocketException{
         socket.setReceiveBufferSize(size);
    }
    public synchronized int getReceiveBufferSize()   throws SocketException{
        return getReceiveBufferSize();
    }
    public void setKeepAlive(boolean on) throws SocketException {
        socket.setKeepAlive(on);
    }
    public boolean getKeepAlive() throws SocketException {
        return socket.getKeepAlive();
    }
    public void setTrafficClass(int tc) throws SocketException {
        socket.setTrafficClass(tc);
    }
    public int getTrafficClass() throws SocketException {
        return socket.getTrafficClass();
    }
    public void setReuseAddress(boolean on) throws SocketException {
        socket.setReuseAddress(on);
    }
    public boolean getReuseAddress() throws SocketException {
        return socket.getReuseAddress();
    }
    public void shutdownInput() throws IOException {
        socket.shutdownInput();
    }
    public void shutdownOutput() throws IOException {
        socket.shutdownOutput();
    }

    public boolean isConnected() {
        return socket.isConnected();
    }
    public boolean isBound() {
        return socket.isBound();
    }
    public boolean isClosed() {
        return socket.isClosed();
    }
    public boolean isInputShutdown() {
        return socket.isInputShutdown();
    }
    public boolean isOutputShutdown() {
        return socket.isOutputShutdown();
    }

}
