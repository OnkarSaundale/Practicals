package ConstructorInjection_Collections_List;

import java.util.Iterator;
import java.util.List;

public class Question //This is Bean Class
{
	private int qid;
	private String qname;
	private List<String>ans;
	
	public Question(int qid, String qname, List<String> ans) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.ans = ans;
	}

	public void display()
	{
		System.out.println("Question id="+qid);
		System.out.println("Ques name: "+qname);
		System.out.println("Answers:");
		
		Iterator<String>itr= ans.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
	
	

}
