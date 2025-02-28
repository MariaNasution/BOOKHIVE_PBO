import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.JTable;
import javax.swing.UIManager;
import repository.MyBookRepository;
import repository.MyBookRepositoryImpl;
import service.MyBookService;
import service.MyBookServiceImpl;
import ui.AppFrame;
import ui.pages.AddPage;
//import view.MyBookView;

public class App_Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception ex) {
           System.out.println("Gagal mengubah desain tampilan");
        }
        
         
        MyBookRepository myBookRepository = new MyBookRepositoryImpl();
      
        MyBookService myBookService = new MyBookServiceImpl(myBookRepository);
        FirstPanel app = new FirstPanel();
      
        app.setMyBookService(myBookService);
        app.setVisible(true);
        
        
            
    }
    }
    
    

