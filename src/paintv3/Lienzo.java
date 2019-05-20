/*
Billy Sican
Alejandro Barreda
*/

package paintv3;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.awt.image.codec.JPEGImageEncoderImpl;


public class Lienzo extends Canvas implements MouseListener, MouseMotionListener {
    //variables para posicion de imagen
    int x = -1; int y= -1; int x1 = -1; int y1 = -1; 
    //caracteristicas de el dibujarenlienzo    
    int grosor = 2, an, al, cx, cy;
    Graphics2D dibujarenlienzo;
    Color colornegro = Color.BLACK;
    Color fondoblanco = Color.WHITE;
    boolean borrar = false;
    //dibujar figuras
    boolean circulo = false, cir = false, cirr = false;
    boolean cuadrado = false, cua = false, cuar = false;
    boolean linea = false, lin = false;
    //texto
    boolean texto = false;
    int tx, ty;
    String text;
    Font letra;
    
    
    //variables para cargar la imagen
    BufferedImage insertarImagen;
    BufferedImage imagenactual;
   
    boolean boolhayunaimagen = false;
   
    double grados;

    public Lienzo(){
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(fondoblanco);   
        
    }
    
    public void paint(Graphics paradibujar){
        dibujarenlienzo = (Graphics2D) paradibujar;
        dibujarenlienzo.setStroke(new BasicStroke(grosor));
        dibujarenlienzo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //borrador
        if(borrar == true){dibujarenlienzo.setColor(Color.white);
            dibujarenlienzo.fillRect(x, y, 10, 10);
        }
       if(borrar == true){
            dibujarenlienzo.setColor(Color.white);
            if (x1 != -1 && x != -1){
                dibujarenlienzo.drawLine(x, y, x1, y1);
            }
        } 
       
        //figuras
        //circulo
        if(circulo == true){ 
            dibujarenlienzo.setColor(colornegro);
            dibujarenlienzo.drawOval(x, y, x1, x1);           
        }else{
            dibujarenlienzo.setColor(colornegro);
        }      
        //cuadrado
        if(cuadrado == true){ 
            dibujarenlienzo.setColor(colornegro);
            dibujarenlienzo.drawRect(x, y, x1, x1);            
        }else{
            dibujarenlienzo.setColor(colornegro);
        }      
        //linea
        if(linea == true){ 
            grosor=2;
            dibujarenlienzo.setColor(colornegro);
            dibujarenlienzo.drawLine(x, y, 2, 2);
        }else{
            dibujarenlienzo.setColor(colornegro);
        }    
        
        if (x1 != -1 && x != -1 && circulo == false && borrar == false
                && cuadrado == false && linea == false){
            dibujarenlienzo.drawLine(x, y, x1, y1); 
        }
        
    }
    //fondo
    public void fondo(){
        fondoblanco = JColorChooser.showDialog(this, "Seleccion Color De Fondo:", fondoblanco);
        if(fondoblanco != null){
            this.setBackground(fondoblanco);
        }
        fondoblanco=Color.WHITE;
    }
    
    //linea
    public void colorparadibujaroescribir(){
        colornegro = JColorChooser.showDialog(this, "Selecciona Un Color", colornegro);
        if(colornegro != null){
            dibujarenlienzo.setColor(colornegro);
        }
        
    }
  
   
    public void LimpiarPantalla(){
        fondoblanco = Color.white;
        this.setBackground(fondoblanco);
        repaint();
        boolhayunaimagen=false;
    }
    
    //IMAGENES
public void Abririmagen(){
    //Selecciona una imagen por medio de JFileChooser con un filtro para archivos jpg
 
        int opcion;
        JFileChooser fd = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPEG","gif","jpg","jpeg","png");
        fd.setFileFilter(filtro);
        opcion = fd.showOpenDialog(this);
        if(opcion == JFileChooser.APPROVE_OPTION){
            try{
                dibujarenlienzo.rotate(0, 480, 280);
                insertarImagen = ImageIO.read(fd.getSelectedFile());
                
          dibujarenlienzo.drawImage(insertarImagen, 0, 0,940, 620,null);
          boolhayunaimagen=true;
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        else{
            
        }
        imagenactual=insertarImagen;
 }

//ROTAR LA IMAGEN
 public void rotar() { 
    dibujarenlienzo.setPaint(Color.WHITE);
    dibujarenlienzo.fillRect(0, 0, 980,630);
     dibujarenlienzo.rotate(3.1416/8, 480, 280);
    
       dibujarenlienzo.drawImage(insertarImagen,  0, 0,942, 620,null);
       boolhayunaimagen=true;
    }
 
 
 
//PONERLA BLANCO Y NEGRO
 public void byn(){
     
    ColorConvertOp ponerlogris = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null); 
insertarImagen = ponerlogris.filter(insertarImagen, null); 
//lapiz.drawImage(imagenactual,  0, 0,940, 620,null);
dibujarenlienzo.drawImage(insertarImagen,  0, 0,this.getWidth(),this.getHeight(),null);
boolhayunaimagen=true;
 }
 
public void regresaraoriginal(){
      dibujarenlienzo.rotate(0, 480, 280);
    insertarImagen=imagenactual;
    dibujarenlienzo.drawImage(insertarImagen,  0, 0,this.getWidth(),this.getHeight(),null);
boolhayunaimagen=true;
}
 //Cambiar tamaño de LA IMAGEN

 public void cambiartamaño(){
   
   
    if(boolhayunaimagen==true){
   int w = insertarImagen.getWidth(),h = insertarImagen.getHeight();         

 JTextField w1 = new JTextField();
 JTextField h1 = new JTextField();
 Object[] message = {
 "valor del ancho: ", w1,
 "valor del alto: ", h1,
 };
 int option = JOptionPane.showConfirmDialog(null, message, "Llena los datos para cambiar tamaño", JOptionPane.OK_CANCEL_OPTION);
 if(option == JOptionPane.OK_OPTION){

 w=Integer.parseInt(w1.getText());
 h=Integer.parseInt(h1.getText());
     System.out.println(x);
     
      BufferedImage nuevoinsertarImagen = new BufferedImage(insertarImagen.getWidth(), insertarImagen.getHeight(),BufferedImage.TYPE_INT_RGB);
		  dibujarenlienzo= nuevoinsertarImagen.createGraphics();
                   dibujarenlienzo.drawImage(insertarImagen, 0, 0, w, h, null);
		//dibujarenlienzo.dispose();
                insertarImagen=nuevoinsertarImagen;
                
 }
 else{
     System.out.println("No se le dio OK");
 }
 }
     else{
         JOptionPane.showMessageDialog(null,"No hay una imagen ");
     }
}

 //CORTAR
 public void cortar(){
        int x = 0, y = 0,w = 0,h = 0;
     if(boolhayunaimagen==true){
           
 JTextField x1 = new JTextField();
 JTextField y1 = new JTextField();
 JTextField w1 = new JTextField();
 JTextField h1 = new JTextField();
 Object[] message = {
 "valor en x donde empezar a cortar:", x1,
 "valor en y donde empezar a cortar:", y1,
 "valor en x donde terminar de cortar:", w1,
 "valor en y donde terminar de cortar:", h1,
 };
 int option = JOptionPane.showConfirmDialog(null, message, "Llena los datos para cambiar tamaño", JOptionPane.OK_CANCEL_OPTION);
 if(option == JOptionPane.OK_OPTION){
 x=Integer.parseInt(x1.getText());
 y=Integer.parseInt(y1.getText());
 w=Integer.parseInt(w1.getText());
 h=Integer.parseInt(h1.getText());
     System.out.println(x);
 }
insertarImagen=insertarImagen.getSubimage(x, y, w,h);
 dibujarenlienzo.setPaint(Color.WHITE);
    dibujarenlienzo.fillRect(0, 0, 980,620);
dibujarenlienzo.drawImage(insertarImagen,  x, y,w, h,null);

 }
     else{
         JOptionPane.showMessageDialog(null,"No hay una imagen que cortar");
     }
 }
 
 
 //GUardar la imagen hecha
 public void guardar(){
    File archivoguardar = new File("imagen_modificada.jpg");
    String formato = "jpg";
        try {
            if(insertarImagen==null){
                System.out.println("No hay imagen a guardar");
      
            }else{
            ImageIO.write(insertarImagen,formato,archivoguardar);
            }
        } catch (IOException ex) {
              }
 }

 //GUARDAR EL LIENZO CON UN DIBUJO
 public void guardardibujo(){
 /* BufferedImage dibujocontodo=new BufferedImage(this.getWidth(),this.getHeight(),BufferedImage.TYPE_INT_ARGB);
  Graphics pasarlienzoabuffer=dibujocontodo.getGraphics();
  this.paint(pasarlienzoabuffer);
 pasarlienzoabuffer.dispose();
   File file = new java.io.File("Lienzo_Guardado.png");
            try {
                ImageIO.write(dibujocontodo, "png", file); 
            } catch (IOException ex) {
                System.out.println("Error al guardar archivo");
            }*/
 JPanel elpanel=new JPanel();
BufferedImage awtImage = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB); 
dibujarenlienzo = (Graphics2D) awtImage.getGraphics(); 
elpanel.printAll(dibujarenlienzo); 

try 
{ 
  File file = new java.io.File("Lienzo_Guardado.jpeg");
FileOutputStream fos = new FileOutputStream(file); 
JPEGImageEncoderImpl j = new JPEGImageEncoderImpl(fos); 
j.encode(awtImage); 
fos.close(); 
}
catch(Exception e){
    
}

 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 //#######################################################################

 
 
 
 
 
 
 
 
 
 
 
    @Override
    public void mouseClicked(MouseEvent ledioclick) {     
        if(ledioclick.getClickCount() == 1){
            if(texto == true){
                tx = ledioclick.getX();
                ty = ledioclick.getY();
                dibujarenlienzo.setFont(letra);
                dibujarenlienzo.drawString(text, tx, ty);
                texto = false;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent loestapresionando) {
        x = loestapresionando.getX();
        y = loestapresionando.getY();
        paint(this.getGraphics());
    }

    @Override
    public void mouseReleased(MouseEvent dejodeapacharlo) {
        if(cir == true){
            dibujarenlienzo.drawOval(cx, cy, an, al);
        }if(cua == true){
            dibujarenlienzo.drawRect(cx, cy, an, al);
        }if(lin == true){
            dibujarenlienzo.drawLine(cx, cy, 2, 2);
        } if(cirr == true){
            dibujarenlienzo.fillOval(cx, cy, an, al);
        }if(cuar == true){
            dibujarenlienzo.fillRect(cx, cy, an, al);
        }
        x = -1;
        x1 = -1;
    
    }

   
    @Override
    public void mouseDragged(MouseEvent arrastrando) {
        x1 = arrastrando.getX();
        y1 = arrastrando.getY();
        //hacer un circulo
        if(cir == true || cua == true || lin == true || cirr == true || cuar == true){
            an = Math.abs(x - x1);
            al = Math.abs(y - y1);
            cx = Math.min(x1, x);
            cy = Math.min(y1, y);
        }else{
        paint(this.getGraphics());
        x = x1;
        y = y1;
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
      }

    @Override
    public void mouseExited(MouseEvent me) {
      }

    @Override
    public void mouseMoved(MouseEvent me) {
    }

   
}
