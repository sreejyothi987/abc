
public class samp {







	public class Activity{
		private String name;
		private Object y;
		private Activity(){   
		public name =”Ajay”;
		}
		public Activity(String name){
			this.name=name;
		}
		String get_Name(){
		return this.name;
		}
		public void display(String name)	{
			
			System.out.println(this.get_Name());
		}
		public static void main(String args[]){
			Activity activity=new Activity();
			activity.display(“Ajay”);
		}
}


}
