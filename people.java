package com.imooc2;

class people {  
    static String name = "�����ض����name";         //���еĳ�Ա��������ֵ  
  
    people(){  
    }  
      
    public static void speak() {  
        String name = "���巽���ж����name";       //�ڷ���speak�ж���ͳ�Ա����������ͬ��name����ֵ  
        System.out.println(name);  
        System.out.println(people.name);      //ͨ��this���������еĳ�Ա����  
          
    }  
    
    //��û��public�࣬��ôԴ�ļ�������ֻҪ��ĳ�����������ͬ�Ϳ����ˡ�  
    public static void main(String[] args) {         
    	//people myPeople = new people();  
    	new people().speak();  
    	people.speak();
    	System.out.println(people.name);
}  
}  
  
    