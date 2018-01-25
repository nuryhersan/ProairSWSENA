package Modelo;

/**
 *
 * @author LENOVO
 */
public class Clientes {
  private Integer idCliente;
  private Integer numiden;

    public Clientes() {
    }

    public Clientes(Integer idCliente,Integer numiden) {
        this.idCliente = idCliente;
        this.numiden = numiden;
        
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", numiden=" + numiden + '}';
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getNumiden() {
        return numiden;
    }

    public void setNumiden(Integer numiden) {
        this.numiden = numiden;
    }


    
}
