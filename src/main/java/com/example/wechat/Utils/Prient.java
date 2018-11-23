package com.example.wechat.Utils;

import com.example.wechat.domain.manual.PrintModel;
import org.apache.commons.lang3.StringUtils;

import java.awt.*;
import java.awt.print.*;
import java.util.List;

public class Prient implements Printable {

    private List<PrintModel> list;

    private String title;

    private Integer height;

    private Integer marginLeft = 50;

    private Integer marginTop = 10;

    public Prient(List<PrintModel> list, String title) {
        this.list = list;
        this.title = title;
    }

    public String commonPrint(){
        int height = 0+list.size()*20+this.height;

        Book book = new Book();

        PageFormat pageFormat = new PageFormat();
        pageFormat.setOrientation(PageFormat.PORTRAIT);

        Paper paper = new Paper();
        paper.setSize(230,height);
        paper.setImageableArea(5,-20,230,height+20);
        pageFormat.setPaper(paper);

        book.append(new Prient(this.list,this.title),pageFormat);

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPageable(book);

        try {
            job.print();
        } catch (PrinterException e) {
            e.printStackTrace();
            return "打印异常";
        }

        return "打印成功";
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if(pageIndex>0){
            return NO_SUCH_PAGE;
        }

        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setFont(new Font(title,Font.PLAIN,12));
        graphics2D.drawString(title, marginLeft, marginTop);
        graphics2D.setFont(new Font(title, Font.PLAIN, 8));

        int i=1;

        graphics2D.drawString("--------------------------------------------",7,20);
        for (PrintModel model : list){
            if(!model.getWrap()){
                if(StringUtils.isNotBlank(model.getName())){
                    graphics2D.drawString(model.getName()+"         "+model.getVal(),7,30+i*12);
                }else if(model.getImage()!=null){
                    graphics2D.drawImage(model.getImage(),15,20+i*12,null);
                    i+=8;
                }
            }else{
                graphics2D.drawString(model.getName(),7,30+i*12);
                i++;
                graphics2D.drawString(model.getVal(),7,30+i*12);
            }
            i++;
        }
        return PAGE_EXISTS;
    }
}
