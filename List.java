package Proyecto;

/**
 *
 * @author Andrijo
 */
public class List {

    //Atributos
    private byte numbElements, size;
    private String list[];

    /*Método constructor
    
     */
    public List() {
        numbElements = 0;
        size = 5;
        list = new String[size];
    }

    public List(byte size) {
        numbElements = 0;
        this.size = size;
        list = new String[size];
    }

    //Métodos get and set
    public byte getNumbElements() {
        return numbElements;
    }

    public void setNumbElements(byte numbElements) {
        this.numbElements = numbElements;
    }

    public byte getSize() {
        return size;
    }

    public void setSize(byte size) {
        this.size = size;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

}
