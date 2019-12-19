package eg;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Integer");
		Integer i1=10;
		Integer i2=10;
		Integer i3=11;
		Integer i4=new Integer(10);
		System.out.println(i1==i2);
		System.out.println(i1==i3);
		System.out.println(i1==i4);
		

		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		System.out.println(i1.equals(i4));
		
		int x=i4;
		System.out.println("x = "+x);
		x=100;
		i4=x;// autoboxing
		System.out.println("i4 = "+i4);
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		
		String s="1000";
		x=Integer.parseInt(s);//String to int/Integer
		System.out.println(x);
		x=99999;
		s=x+""; //converting to String
		System.out.println(s);
		s=i4.toString();
		System.out.println(s);
		System.out.println(Integer.toBinaryString(11));
		System.out.println(Integer.toHexString(19079));
		
		Integer i5=99;
		System.out.println(i5.compareTo(99)); // 0
		System.out.println(i5.compareTo(79)); // 1
		System.out.println(i5.compareTo(999)); // -1
		
		float f=i5.floatValue();
		System.out.println(f);
		
		Double d=999.9999;
		x=d.intValue();
		System.out.println(x);
		
		
		//TODO Long, Double, & Float
		
		System.out.println("\nLong");
		
		Long l1 = 120993887657l;
		Long l2 = 123456789098l;
		Long l3 = 120993887657l;
		Long l4 = new Long(120993887657l);
		
		System.out.println(l1==l2);
		System.out.println(l1==l3);
		System.out.println(l1==l4);
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		System.out.println(l1.equals(l4));
		
		long y = l4;
		System.out.println("y = "+y);
		
		y = 120397578492l;
		l4=y;//autoboxing
		System.out.println("l4 = "+l4);
		
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		
		String t="2382828282";
		y=Long.parseLong(t);
		System.out.println(y);
		t=l4.toString();
		System.out.println(t);
		
		System.out.println(Long.toBinaryString(1122445));
		System.out.println(Long.toHexString(1907922144551l));
		
		Long l5=402945782333l;
		
		System.out.println(l5.compareTo(402945782333l));
		System.out.println(l5.compareTo(40294578232l));
		System.out.println(l5.compareTo(4029457823433l));
		
		float f1=l5.floatValue();
		System.out.println(f1);
		
		Double dd=129480.435622;
		
		y=dd.longValue();
		System.out.println(y);
		
		//TODO Double & Float
		
		System.out.println("\nDouble");
		
		Double d1 = 1209938.87657;
		Double d2 = 1234.56789098;
		Double d3 = 1209938.87657;
		Double d4 = new Double(1209938.87657);
		
		System.out.println(d1==d2);
		System.out.println(d1==d3);
		System.out.println(d1==d4);
		
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(d1.equals(d4));
		
		double z = d4;
		System.out.println("z = "+z);
		
		z = 12039.7578492;
		d4=z;//autoboxing
		System.out.println("d4 = "+d4);
		
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		
		String r="2382828282";
		y=Long.parseLong(r);
		System.out.println(y);
		r=d4.toString();
		System.out.println(r);
		
		System.out.println("Bytes = " + Double.BYTES);
		System.out.println(Double.toHexString(19079221.44551));
		
		Double d5=40294.5782333;
		
		System.out.println(d5.compareTo(40294.5782333));
		System.out.println(d5.compareTo(40294.578232));
		System.out.println(d5.compareTo(40294.57823433));
		
		float f2=l5.floatValue();
		System.out.println(f1);
		
		Double ddd=129480.435622;
		
		z=ddd.doubleValue();
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
