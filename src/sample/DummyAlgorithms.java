package sample;

import javafx.embed.swing.SwingFXUtils;
import javafx.embed.swt.SWTFXUtils;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

public class DummyAlgorithms {
    private BufferedImage master;

    public DummyAlgorithms(Image source) { master = SwingFXUtils.fromFXImage(source, null); }


    //TODO: Note that this function returns buffered image. We can also return Image by applying
    // SwingFXUtils.toFXImage(gray, null).
    public BufferedImage huffman(){
        BufferedImage gray = new BufferedImage(master.getWidth(), master.getHeight(), BufferedImage.TYPE_INT_RGB);

        ColorConvertOp op = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
        op.filter(master, gray);

        return gray;
    }
}
