
public class Testldl {
	 
		String reg,left;  
		public String find(String str){  
			//最长的重复字串，极端情况就比如abcabc，最长重复字串就是abc  
			//即为字符串长度的一半，当然这是极端情况，通常都是小于串长一半的  
			for(int len=str.length()/2;len>0;len--){  
				//将字符串分隔为若干“最长字串”  
				for(int i=0;i<len;i++){
					//获取“最长字串”  
					reg=str.substring(0,len+1);  
					//刨去“最长字串”剩下的串  
					left=str.substring(len+1);  
					//如果剩下的串里面包含“最长字串”  
					if(left.indexOf(reg)!=-1)  
						//bingo!  
						return reg;  
				}  
			}  
			//啥也找不到就返回空吧  
			return null;  
		}  
		public static void main(String[] args) throws Exception{  
		  
			String str=new Testldl().find("ddd1111abcdabc1111ffs");  
			System.out.println(str);  
		}  
	
}
