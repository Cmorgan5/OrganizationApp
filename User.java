
		
		   public class User
		   {
			   private String firstName;
		       private String lastName;
		       private String username;
		       private String password;

		       private static int count = 0; // number of objects in memory

		       // initialize user, add 1 to static count and
		        // output String indicating that constructor was called
		        public User( String first, String last )
		        {
		           firstName = first;
		           lastName = last;

		           count++; // increment static count of Users
		           System.out.printf( "User constructor: %s %s; count = %d\n",
		              firstName, lastName, count );
		        } // end User constructor


		       


		        //another constructer 
		        public User( String first, String last, String name, String pass)
		        {
		           
		           this.firstName = first;
		           this.lastName = last;
		           this.username = name;
		           this.password = pass;

		           count++; // increment static count of Users
		           System.out.printf( "User constructor: %s %s; count = %d\n",
		              firstName, lastName, count );
		        } // end User constructor


		        // subtract 1 from static count when garbage
		        // collector calls finalize to clean up object;
		        // confirm that finalize was called
		        protected void finalize()
		        {
		           count--; // decrement static count of users
		           System.out.printf( "User finalizer: %s %s; count = %d\n",
		              firstName, lastName, count );
		        } // end method finalize

		      // set first name
		        public void setFirstName(String firstName)
		        {
		           this.firstName = firstName;
		        } // end method setFirstName

		        // set last name
		        public void setLastName(String lastName)
		        {
		           this.lastName = lastName;
		        } // end method setLastName

		       // set user name
		        public void setUserName(String name)
		        {
		           this.username = name;
		        } // end method setUserName

		        // set password
		        public void setPassword(String password)
		        {
		           this.password = password;
		        } // end method setPassword


		       // get username
		        public String getUserName()
		        {
		           return username;
		        } // end method getUserName

		        // get password
		        public String getPassword()
		        {
		           return password;
		        } // end method getPassword

		       // get first name
		        public String getFirstName()
		        {
		           return firstName;
		        } // end method getFirstName

		        // get last name
		        public String getLastName()
		        {
		           return lastName;
		        } // end method getLastName

		        // static method to get static count value
		        public static int getCount()              
		        {                                         
		           return count;                          
		        } // end method getCount
		        
		        
		        
		        public static boolean isMember(int[] array, int value) {
		            if(array.length == 0) return false; 
		            if(array[0] == value) return true;
		            int[] array2 = new int[array.length-1];
		            System.arraycopy(array,1,array2,0,array2.length);
		            return isMember(array2, value);           
		        }
		        
		        
		     /**
		      * 
		      *    User will created and added to a map that will give 
		      *    user a unique key so that everyone will be recognized
		      *    differently within the organization
		        User john = new User("John", "Smith", "jsmith1", "password123");
		        john.setPassword("password123");
		        
		        
		        
		        Map.add("jsmith1"); 
		        Map.get("jsmith1"); 
		        
		        
**/
		   }
		
