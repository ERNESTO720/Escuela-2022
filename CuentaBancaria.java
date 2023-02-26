public class CuentaBancaria {
    String nombreTitular;
    String apellidoTitular;
    int numeroCuenta;
    enum TipoCuenta{AHORROS,CORRIENTE}
    TipoCuenta cuenta;
    float saldo=0;

    public CuentaBancaria(String nombreTitular,String apellidoTitular,int numeroCuenta,float saldo,TipoCuenta cuenta){
        this.nombreTitular=nombreTitular;
        this.apellidoTitular=apellidoTitular;
        this.numeroCuenta=numeroCuenta;
        this.cuenta=cuenta;
        this.saldo=saldo;
    }
    void imprimir(){
        System.out.println("nombre de titular: "+nombreTitular);
        System.out.println("apellido del titular: "+apellidoTitular);
        System.out.println("numero de cuenta: "+numeroCuenta);
        System.out.println("tipo de cuenta: "+cuenta);
        System.out.println("saldo: "+saldo);
    }
    boolean Val(int val){
        saldo+=val;
        System.out.println("se ha consignado $"+val+"de la cuenta. El nuevo saldo es "+val);
        return true;
    }
    boolean Com(TipoCuenta Cuenta){
        boolean resul;
        if(cuenta==Cuenta){
        resul=true;
        }else{
        resul=false;
        }
        return resul;
    }
    void Tra(){
        float saldo2=2000000;
        saldo2=saldo2-200000;
        saldo=saldo+200000;
        System.out.println("Se ha consignado $200000 en la cuenta. El nuevo saldo es "+saldo);
        saldo2=saldo2-300000;
        saldo=saldo+300000;
        System.out.println("Se ha consignado $300000 en la cuenta. El nuevo saldo es "+saldo);
        saldo2=saldo2-400000;
        saldo=saldo+500000;
        System.out.println("Se ha consignado $4000000 en la cuenta. El nuevo saldo es "+saldo);
    }
    public static void main(String[] args) {
       CuentaBancaria usuario=new CuentaBancaria("Diego Ernesto", "Rivas Valdez", 123456789, 0, TipoCuenta.CORRIENTE);
       usuario.imprimir();
       usuario.Tra();
      }
}
