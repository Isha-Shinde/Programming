import java.io.*;
import javax.swing.*;

class program733X
{
    public static void main(String A[]) throws Exception
    {
        JFrame fobj = new JFrame("Unpacker");

        JLabel lPack = new JLabel("Packed file name");

        JTextField txtPack = new JTextField();

        JButton btnUnpack = new JButton("Unpack");


        // Packed file name
        lPack.setBounds(50, 100, 130, 30);   // x,y,width,height
        txtPack.setBounds(200, 100, 300, 35);


        // Unpack button
        btnUnpack.setBounds(200, 220, 150, 45);


        // Add components
        fobj.add(lPack);
        fobj.add(txtPack);
        fobj.add(btnUnpack);


        // Unpack button event
        btnUnpack.addActionListener(e ->
        {
            String PackFileName = txtPack.getText().trim();

            if(PackFileName.length() == 0)
            {
                JOptionPane.showMessageDialog(
                    fobj,
                    "Please enter packed file name",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );

                return;
            }

            try
            {
                unpack(PackFileName);

                JOptionPane.showMessageDialog(
                    fobj,
                    "Unpacking completed successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(
                    fobj,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        });


        // Frame settings
        fobj.setSize(600, 400);
        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

////////////////////// Unpaking Method ///////////////////////////
    
    public static void unpack(String PackFileName) throws Exception
    {
        File fpackobj = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        byte Header[] = new byte[100];

        String strHeader = null;
        String Tokens[] = null;

        File NewFile = null;

        byte Buffer[] = null;
        int iRet = 0;
        int FileSize = 0;

        fpackobj = new File(PackFileName);

        if(fpackobj.exists())
        {
            fiobj = new FileInputStream(fpackobj);

            // Read header
            while((iRet = fiobj.read(Header, 0, 100)) != -1)
            {
                strHeader = new String(Header);

                System.out.println("Header is : "+strHeader);

                // Remove extra spaces
                strHeader = strHeader.trim();
                
                // Separate filename and file size
                Tokens = strHeader.split("\\|");

                System.out.println("File name : "+Tokens[0]);
                System.out.println("File size : "+Tokens[1]);

                // Get file size
                FileSize = Integer.parseInt(Tokens[1]);

                NewFile = new File(Tokens[0]);
                NewFile.createNewFile();

                foobj = new FileOutputStream(NewFile);

                // Create buffer according to file size
                Buffer = new byte[FileSize];

                // read file data
                fiobj.read(Buffer, 0, FileSize);

                // Write the data
                foobj.write(Buffer, 0, FileSize);

                foobj.close();
            }// End of while

            // Close packed file
            fiobj.close();
        }
        else
        {
            System.out.println("There is no such pack file");
        }
    }
}