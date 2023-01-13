package ConstructorInjection_Collections_Map;

import java.util.Map;

public class Question 
{
	private int qid;
	private String qname;
	private Map<String,String>ans;
	
	public Question(int qid, String qname, Map<String, String> ans) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.ans = ans;
	}

	public void display()
	{
		System.out.println("Question id="+qid);
		System.out.println("Question name= "+qname);
		System.out.println("Answers:");
		for(Map.Entry<String, String>e:ans.entrySet())
		{
			System.out.println("Answer="+e.getKey()+"posted by="+e.getValue());
			
		}
	}
	
	
	
}
