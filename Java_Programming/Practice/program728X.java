//////////////////////////////////
// Final Packing Code
//////////////////////////////////

import java.io.*;                                                                                                                                                                                                                                                                                                                                                                                                                                    
import javax.swing.*;

class program728X
{
    //////////////// GUI Method ////////////////////////
    public static void main(String A[]) 
    {   
        JFrame fobj = new JFrame("Packer");

        JLabel lFolder = new JLabel("Folder name");
        JLabel lPack = new JLabel("packed file name");

        JTextField txtFolder = new JTextField();
        JTextField txtPack = new JTextField();

        JButton btnPack = new JButton("Pack");

        // Folder name
        lFolder.setBounds(50, 80, 120, 30);
        txtFolder.setBounds(180, 80, 350, 35);


        // Packed file name
        lPack.setBounds(50, 150, 120, 30);
        txtPack.setBounds(180, 150, 350, 35);


        // Pack button
        btnPack.setBounds(220, 240, 150, 45);

        // Add components
        fobj.add(lFolder);
        fobj.add(txtFolder);

        fobj.add(lPack);
        fobj.add(txtPack);

        fobj.add(btnPack);

        // Pack button event
        btnPack.addActionListener(e ->
        {
            String FolderName = txtFolder.getText().trim();
            String PackFileName = txtPack.getText().trim();

            if(FolderName.length() == 0)
            {
                JOptionPane.showMessageDialog
                (
                    fobj,
                    "Please enter folder name",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );

                return;
            }

            if(PackFileName.length() == 0)
            {
                JOptionPane.showMessageDialog
                (
                    fobj,
                    "Please enter packed file name",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );

                return;
            }

            try
            {
                pack(FolderName, PackFileName);

                JOptionPane.showMessageDialog
                (
                    fobj,
                    "Packing completed successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog
                (
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

////////////////////// Packing Method /////////////////////////////
    public static void pack(String FolderName, String PackFileName)
        throws Exception
    {
        int iRet = 0;
        int Size = 0;
        int i = 0, j = 0;

        String header = "";

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        byte Buffer[] = new byte[1024];
        byte bHeader[] = null;
        
        File fobjfolder = new File(FolderName);

        if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
        {

            File fobjpack = new File(PackFileName);
            fobjpack.createNewFile();   // Pack file gets created

            foobj = new FileOutputStream(fobjpack);

            File fArr[] = fobjfolder.listFiles();
         
            for(i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);
                
                header = "";
                header = header + fArr[i].getName();
                header = header + "|";
                header = header + fArr[i].length();

                Size = 100 - header.length();

                for(j = 1; j <= Size; j++)
                {
                    header = header + " ";
                }

                bHeader = header.getBytes();
                                
                // Write header
                foobj.write(bHeader);

                // Loop to read from fiobj & write to foobj   
                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }

                fiobj.close();
                header = "";
            }

            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }

    }
}