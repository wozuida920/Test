
public class Testldl {
	 
		String reg,left;  
		public String find(String str){  
			//����ظ��ִ�����������ͱ���abcabc����ظ��ִ�����abc  
			//��Ϊ�ַ������ȵ�һ�룬��Ȼ���Ǽ��������ͨ������С�ڴ���һ���  
			for(int len=str.length()/2;len>0;len--){  
				//���ַ����ָ�Ϊ���ɡ���ִ���  
				for(int i=0;i<len;i++){
					//��ȡ����ִ���  
					reg=str.substring(0,len+1);  
					//��ȥ����ִ���ʣ�µĴ�  
					left=str.substring(len+1);  
					//���ʣ�µĴ������������ִ���  
					if(left.indexOf(reg)!=-1)  
						//bingo!  
						return reg;  
				}  
			}  
			//ɶҲ�Ҳ����ͷ��ؿհ�  
			return null;  
		}  
		public static void main(String[] args) throws Exception{  
		  
			String str=new Testldl().find("ddd1111abcdabc1111ffs");  
			System.out.println(str);  
		}  
	
}
