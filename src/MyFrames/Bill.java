package MyFrames;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMEER
 */
public class Bill {

    private int bno;
    private String cname;
    private float amt;
    private String pdate;
    
    public Bill(int bno,String cname,float amt, String pdate)
    {
        this.bno=bno;
        this.cname=cname;
        this.amt=amt;
        this.pdate=pdate;
        
        
    }
            
    public int getbno()
    {
        return bno;
    }
    public String getcname()
    {
        return cname;
    }
    public float getamt()
    {
        return amt;
    }
    public String getpdate()
    {
        return pdate;
    }
  }
