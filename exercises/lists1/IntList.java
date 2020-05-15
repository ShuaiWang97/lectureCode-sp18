public class IntList {
	public int first;
	public IntList rest;
	

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		
        if(this.rest==null){
        	return 1;
        }
        else {
        	return 1+this.rest.size();
        }
	}

	/** Return the size of the list using iteration! */
	public int iterativeSize() {
		IntList P=this;
        int number=1;
		while (P.rest!=null){
			number=number+1;
			P=P.rest;
		}
		
			return number;
	    
	}

	/** Returns the ith value in this list with iteration method.*/
	public int get_iter(int i) {
       
        IntList P=this;
       while (i!=1){
       	i=i-1;
       	P=P.rest;
       }
       return P.first;
	}

	/** Returns the ith value in this list with recursion method.*/
	public int get_recur(int i){
          if (i==1){
          	return this.first;
          }
          else{
          	return this.rest.get_recur(i-1);
          }

	}



	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.size());
		System.out.println(L.get_recur(3));
	}
} 
