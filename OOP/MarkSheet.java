package InputOutput.OOP;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MarkSheet implements Externalizable {

	public static void main(String[] args) {
	}
		char n;
		int phy =0;
		int chem=0;
		int math = 0;
	transient int temp = 0;
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		char  Char = in.readChar();
		phy=in.readInt();
		chem=in.readInt();
		math=in.readInt();
		temp=in.readInt();
	
	}    
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeChar(n);
		out.writeInt(phy);
		out.writeInt(chem);
		out.writeInt(math);
		out.writeInt(temp);
		
		
	}
	
}	

	


