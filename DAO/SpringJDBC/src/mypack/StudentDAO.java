package mypack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAO
	{
		private JdbcTemplate jdbcTemp;

		public JdbcTemplate getJdbcTemp()
			{
				return jdbcTemp;
			}

		public void setJdbcTemp(JdbcTemplate jdbcTemp)
			{
				this.jdbcTemp = jdbcTemp;
			}
		
		public int saveRec(Student e)
			{  
			 String query="insert into student values("+e.getRollno()+",'"+e.getName()+"',"+e.getMarks()+")";  
			    return jdbcTemp.update(query);  
			}  
			public int updateRec(Student e){  
			    String query="update student set name='"+e.getName()+"',marks="+e.getMarks()+" where rollno="+e.getRollno();  
			    return jdbcTemp.update(query);  
			}  
			public int deleteRec(Student e){  
			    String query="delete from student where rollno="+e.getRollno();  
			    return jdbcTemp.update(query);  
			}  
			public void showAllRecords() {
				List<Student> l=new ArrayList<Student>();
				jdbcTemp.query("select * from student",new RowMapper() {

					@Override
			public Object mapRow(ResultSet rs, int count) throws SQLException 
					{
						Student e=new Student();
						e.setRollno(rs.getInt(1));
						e.setName(rs.getString(2));
						e.setMarks(rs.getInt(3));
						l.add(e);
						return e;
					}
				});
				for(Student i:l) {
					System.out.println(i);
				}
	}
	}
