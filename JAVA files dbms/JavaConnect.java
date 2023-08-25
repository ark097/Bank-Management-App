/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Achyut R Kowshik
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
    static Connection con;
    static ResultSet rs;
    static Statement pst;
    static CallableStatement cst;
    public static void JavaConnectdb(){
         try {
            String host = "jdbc:mysql://localhost:3306/ach?zeroDateTimeBehavior=convertToNull";
            String user="root";
            String pass="1234";
            con=DriverManager.getConnection(host,user,pass);
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e.getMessage());               
        }
    }
        public static ResultSet Up1(String n) throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="Select * from account where name='"+n+"'";
        rs = pst.executeQuery(sql);
        return rs;
}
    
        public static ResultSet Up() throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="Select * from account";
        rs = pst.executeQuery(sql);
        return rs;
}  
            public static ResultSet bal_Up() throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="Select * from balances";
        rs = pst.executeQuery(sql);
        return rs;
} 
             public static ResultSet user_pass(String n) throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="Select acc,pin from account where acc="+n;
        rs = pst.executeQuery(sql);
        return rs;
}  
                      public static ResultSet trans(String n) throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="Select acc,balance from balances where acc="+n;
        rs = pst.executeQuery(sql);
        return rs;
}  
              public static ResultSet table_one() throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="select acc,name,balance from balances";
        rs = pst.executeQuery(sql);
        return rs;
}
             public static ResultSet table_two() throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="select acc,name,dob,acc_type,mob,loyalty from account";
        rs = pst.executeQuery(sql);
        return rs;
}                 
             public static ResultSet dep_search(String n) throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="select * from balances where name='"+n+"'";
        rs = pst.executeQuery(sql);
        return rs;
}
             public static ResultSet trans_search(String n) throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="select * from balances where name='"+n+"'";
        rs = pst.executeQuery(sql);
        return rs;
}
             public static ResultSet trans_bal() throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="select * from balances";
        rs = pst.executeQuery(sql);
        return rs;
}
             public static ResultSet with_search(String n) throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="select * from balances where name='"+n+"'";
        rs = pst.executeQuery(sql);
        return rs;
}
             public static ResultSet view_search(String n) throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="select * from balances where name='"+n+"'";
        rs = pst.executeQuery(sql);
        return rs;
}
             public static ResultSet with_draw(String n) throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="select acc,balance from balances where acc="+n;
        rs = pst.executeQuery(sql);
        return rs;
}
          public static ResultSet user_passname(String n) throws SQLException{
        
        pst = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql="Select acc,pin from account where name='"+n+"'";
        rs = pst.executeQuery(sql);
        return rs;
}
          public static CallableStatement call_able(int b) throws SQLException{
              String a="Savings";
              String sql = "call increase_bal("+"\""+a+"\""+","+b+")";
              cst=con.prepareCall(sql);
              cst.execute();
              return cst;
}
    }

    

 






