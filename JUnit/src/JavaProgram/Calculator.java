
package JavaProgram;

public class Calculator {
      double r;
    public double add(double v1,double v2) throws Exception{        
        
        if(!((v1>-10000) && (v1<10000))){
            throw new Exception("V1 out of bound");
        }
        else if(!((v2>-10000) && (v2<10000))){
            throw new Exception("V2 out of bound");
        }
        
        r=v1+v2;
        
        if(!((r>-10000) && (r<10000))){
            throw new Exception("r out of bound");
        }
        
        return r;
    }
    public double sub(double v1,double v2)throws Exception{        
         if(!((v1>-10000) && (v1<10000))){
            throw new Exception("V1 out of bound");
        }
        else if(!((v2>-10000) && (v2<10000))){
            throw new Exception("V2 out of bound");
        }
        
        r=v1-v2;
        if(!((r>-10000) && (r<10000))){
            throw new Exception("r out of bound");
        }
        return r;
    }
    public double mul(double v1,double v2) throws Exception{ 
        
         if(!((v1>-10000) && (v1<10000))){
            throw new Exception("V1 out of bound");
        }
        else if(!((v2>-10000) && (v2<10000))){
            throw new Exception("V2 out of bound");
        }
         
        r=v1*v2;
        if(!((r>-10000) && (r<10000))){
            throw new Exception("r out of bound");
        }
        return r;
    }
    public double div(double v1,double v2) throws Exception{
        
         if(!((v1>-10000) && (v1<10000))){
            throw new Exception("V1 out of bound");
        }
        else if(!((v2>-10000) && (v2<10000))){
            throw new Exception("V2 out of bound");
        }
         
        r=v1/v2;
        if(!((r>-10000) && (r<10000))){
            throw new Exception("r out of bound");
        }
        return r;
    }
}
