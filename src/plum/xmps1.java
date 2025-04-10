package plum;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.testng.Assert;

public class xmps1 {

	public static void main(String[] args) throws InterruptedException, UnsupportedFlavorException, IOException {
        String shortcutPath = "C:\\Users\\Admin\\Desktop\\xmps1.lnk";

        try {
        	ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "start", "", shortcutPath);
            processBuilder.start();
            System.out.println("Shortcut executed successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Thread.sleep(20000);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String clipboardText = (String) clipboard.getData(DataFlavor.stringFlavor);
        String expectedText = "Add Tag Name First Before Proceeding Further";
        Assert.assertEquals(clipboardText, expectedText, "Clipboard content does not match!");
        System.out.println("Clipboard text matches expected text!");

	}

}
