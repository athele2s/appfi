
public class Project2 {
	private String[][] str;
	public Project2(String[][] str){
		this.str=str;
	}
	public boolean isWellSorted( String[] sequence ){
		for(int i=0;i<sequence.length-1;i++){
			for(int u=0;u<str.length;u++) {
				if((sequence[i]+sequence[i+1]).compareTo(this.str[u][1]+this.str[u][0])==0) {
					return false;
				}
			}
			}
		return true;
	}
	
}
