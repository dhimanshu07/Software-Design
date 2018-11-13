

class LinkedList{
        private Book head;
        
	    public  LinkedList(){head=null;}

		public  void insert(int id,String n,String a, int t, String no)
	        {      Book temp =new Book(id, n,a, t,no);
			       temp.next=head;
			       head=temp;
			}
       


		public  int count()
	        {      Book temp=head;
                   int res=0;
	               while(temp!=null) {
                          res++;
	                      temp=temp.next;}
	               
	               return res; }


		public String delete_first()
	       {         if (head==null)return null;
		             String res=head.readDetails();
		             head = head.next;
		             return res;
             }
		
		
		public void delete_all()
	       {         head=null;
               }


	     public void printlist()
	                        {
		               Book temp=head;
		               System.out.println("\nList:");
		               System.out.print("HEAD->");
			           while(temp!=null) {
			               temp.print();
			               temp=temp.next;}
			               
			            System.out.print("NULL");   
			               
			            }

	     public  String search(String search)
	        {    
				String str = " ";
				Book temp=head;
				while(temp!=null) {
	              if((temp.name).equals(search))
	              {
	            	str = "Book ID : " + temp.id + " Name : " + temp.name + "\n Author : " + temp.author + temp.rules + "\n";
	              }
	               temp=temp.next;
				}
				return str;              
	        }
	     
	     
	     void deleteNode(int position) 
	     { 
	       
	         if (head == null) 
	             return; 
	   
	          
	         Book temp = head; 
	   
	        
	         if (position == 1) 
	         { 
	             head = temp.next;   
	             return; 
	         } 
	   
	         
	         for (int i=2; temp!=null && i<position; i++) 
	             temp = temp.next; 
	   
	        
	         if (temp == null || temp.next == null) 
	             return; 
	   
	          
	         Book next = temp.next.next; 
	   
	         temp.next = next; 
	     } 
	     
	     public String getDetails()
         {
    Book temp=head;
   String res= "";
    while(temp!=null) {
        res += "Book ID : " + temp.id + " Name : " + temp.name + "\n Author : " + temp.author + temp.rules + "\n";  
        temp=temp.next;}
        
    return res;
     }
   }


   