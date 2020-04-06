package hashcode;

/*This is typically implemented by converting the internal address of the object into an integer, 
 * but this implementation technique is not required by the JavaTM programming language*/
public class HascodeTest {
	
	public static void main(String[] args) {
		Instance i1=new Instance();
		Instance i2=new Instance();
		System.out.println(i1.hashCode()+","+i2.hashCode());

	}

}
class Instance {
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}