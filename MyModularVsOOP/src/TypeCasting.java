
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a = 23;
	//	float b = 23.2;  //by default decimal is considered as double
		float c = 23.2f;
		float d = (float)23.2;
        double e = 23;
        double f = 23.3;
        
        
        int x = 10;
        byte p = 20;
      //  byte sum = x+p // x + p converted to int because int has higher byte. and it is stored in byte
        byte sum2 = (byte)(x+p);	
        
        
      //  long s = (10L+34.5f);  //converting to float
        long s1 = (long)(10L+34.5f);
	}

}
