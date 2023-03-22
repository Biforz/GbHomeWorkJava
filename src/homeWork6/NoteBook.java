package homeWork6;

import java.util.Objects;

public class NoteBook {
    public String model;
    public String size;
    public String cpu;
    public String os;
    public int ram;
    public int ssd;

    public NoteBook(String model, String size, String cpu, String os, int ram, int ssd) {
        this.model = model;
        this.size = size;
        this.cpu = cpu;
        this.os = os;
        this.ram = ram;
        this.ssd = ssd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Ноутбук : " +
                "модель = " + model +
                ", диагональ экрана = " + size +
                ", процессор = " + cpu +
                ", операционная система = " + os +
                ", оперативная память = " + ram + "Gb" +
                ", объем накопителя = " + ssd + "Gb";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return ram == noteBook.ram && ssd == noteBook.ssd && Objects.equals(model, noteBook.model) && Objects.equals(size, noteBook.size) && Objects.equals(cpu, noteBook.cpu) && Objects.equals(os, noteBook.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, size, cpu, os, ram, ssd);
    }

}
