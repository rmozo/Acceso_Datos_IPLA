package Modelo;

public class Productos extends Marcas{
  //Atributos
    private int pro_codigo_interno;
    private int pro_codigo_barra;
    private String pro_nombre;
    private String pro_descripcion;
    private float pro_precio_c;
    private float pro_margen_utilidad_ma;
    private float pro_margen_utilidad_me;
    private int pro_precio_venta_ma;
    private int pro_precio_venta_me;
    private int pro_stock_ma;
    private int pro_stock_me;

    //Constructores  
    public Productos() {
    }

    public Productos(int pro_codigo_interno, int pro_codigo_barra, String pro_nombre, String pro_descripcion, float pro_precio_c, float pro_margen_utilidad_ma, float pro_margen_utilidad_me, int pro_precio_venta_ma, int pro_precio_venta_me, int pro_stock_ma, int pro_stock_me) {
        this.pro_codigo_interno = pro_codigo_interno;
        this.pro_codigo_barra = pro_codigo_barra;
        this.pro_nombre = pro_nombre;
        this.pro_descripcion = pro_descripcion;
        this.pro_precio_c = pro_precio_c;
        this.pro_margen_utilidad_ma = pro_margen_utilidad_ma;
        this.pro_margen_utilidad_me = pro_margen_utilidad_me;
        this.pro_precio_venta_ma = pro_precio_venta_ma;
        this.pro_precio_venta_me = pro_precio_venta_me;
        this.pro_stock_ma = pro_stock_ma;
        this.pro_stock_me = pro_stock_me;
    }

    public Productos(int pro_codigo_interno, int pro_codigo_barra, String pro_nombre, String pro_descripcion, float pro_precio_c, float pro_margen_utilidad_ma, float pro_margen_utilidad_me, int pro_precio_venta_ma, int pro_precio_venta_me, int pro_stock_ma, int pro_stock_me, int mar_codigo, int cat_codigo, int tipo_codigo) {
        super(mar_codigo, cat_codigo, tipo_codigo);
        this.pro_codigo_interno = pro_codigo_interno;
        this.pro_codigo_barra = pro_codigo_barra;
        this.pro_nombre = pro_nombre;
        this.pro_descripcion = pro_descripcion;
        this.pro_precio_c = pro_precio_c;
        this.pro_margen_utilidad_ma = pro_margen_utilidad_ma;
        this.pro_margen_utilidad_me = pro_margen_utilidad_me;
        this.pro_precio_venta_ma = pro_precio_venta_ma;
        this.pro_precio_venta_me = pro_precio_venta_me;
        this.pro_stock_ma = pro_stock_ma;
        this.pro_stock_me = pro_stock_me;
    }

     

          
    //Getter & Setter
    public int getPro_codigo_interno() {
        return pro_codigo_interno;
    }

    public void setPro_codigo_interno(int pro_codigo_interno) {
        this.pro_codigo_interno = pro_codigo_interno;
    }

    public int getPro_codigo_barra() {
        return pro_codigo_barra;
    }

    public void setPro_codigo_barra(int pro_codigo_barra) {
        this.pro_codigo_barra = pro_codigo_barra;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_descripcion() {
        return pro_descripcion;
    }

    public void setPro_descripcion(String pro_descripcion) {
        this.pro_descripcion = pro_descripcion;
    }

    public float getPro_precio_c() {
        return pro_precio_c;
    }

    public void setPro_precio_c(float pro_precio_c) {
        this.pro_precio_c = pro_precio_c;
    }

    public float getPro_margen_utilidad_ma() {
        return pro_margen_utilidad_ma;
    }

    public void setPro_margen_utilidad_ma(float pro_margen_utilidad_ma) {
        this.pro_margen_utilidad_ma = pro_margen_utilidad_ma;
    }

    public float getPro_margen_utilidad_me() {
        return pro_margen_utilidad_me;
    }

    public void setPro_margen_utilidad_me(float pro_margen_utilidad_me) {
        this.pro_margen_utilidad_me = pro_margen_utilidad_me;
    }

    public int getPro_precio_venta_ma() {
        return pro_precio_venta_ma;
    }

    public void setPro_precio_venta_ma(int pro_precio_venta_ma) {
        this.pro_precio_venta_ma = pro_precio_venta_ma;
    }

    public int getPro_precio_venta_me() {
        return pro_precio_venta_me;
    }

    public void setPro_precio_venta_me(int pro_precio_venta_me) {
        this.pro_precio_venta_me = pro_precio_venta_me;
    }

    public int getPro_stock_ma() {
        return pro_stock_ma;
    }

    public void setPro_stock_ma(int pro_stock_ma) {
        this.pro_stock_ma = pro_stock_ma;
    }

    public int getPro_stock_me() {
        return pro_stock_me;
    }

    public void setPro_stock_me(int pro_stock_me) {
        this.pro_stock_me = pro_stock_me;
    }
    
    
}
