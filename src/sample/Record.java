package sample;

import javafx.beans.property.SimpleStringProperty;

public class Record {
    private final SimpleStringProperty source = new SimpleStringProperty("");
    private final SimpleStringProperty name = new SimpleStringProperty("");
    private final SimpleStringProperty symbol = new SimpleStringProperty("");
    private final SimpleStringProperty fundname = new SimpleStringProperty("");
    private final SimpleStringProperty ttype = new SimpleStringProperty("");
    private final SimpleStringProperty divrate = new SimpleStringProperty("");
    private final SimpleStringProperty shares = new SimpleStringProperty("");
    private final SimpleStringProperty shprice = new SimpleStringProperty("");
    private final SimpleStringProperty tfee = new SimpleStringProperty("");
    private final SimpleStringProperty tamt = new SimpleStringProperty("");
    private final SimpleStringProperty note = new SimpleStringProperty("");
    private final SimpleStringProperty taxlot = new SimpleStringProperty("");

    public Record() {
        this("", "", "", "", "", "", "",
             "", "", "", "", "");
    }

    public Record(String source, String name, String symbol, String fundname, String ttype,
                  String divrate, String shares, String shprice, String tfee, String tamt,
                  String note, String taxlot) {
        setSource(source);
        setName(name);
        setSymbol(symbol);
        setFundname(fundname);
        setTtype(ttype);
        setDivrate(divrate);
        setShares(shares);
        setShprice(shprice);
        setTfee(tfee);
        setTamt(tamt);
        setNote(note);
        setTaxlot(taxlot);
    }

    public String getSource() {
        return source.get();
    }

    public void setSource(String v) {
        source.set(v);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String v) {
        name.set(v);
    }

    public String getSymbol() {
        return symbol.get();
    }

    public void setSymbol(String v) {
        symbol.set(v);
    }

    public String getFundname() {
        return fundname.get();
    }

    public void setFundname(String v) {
        fundname.set(v);
    }

    public String getTtype() {
        return ttype.get();
    }

    public void setTtype(String v) {
        ttype.set(v);
    }

    public String getDivrate() {
        return divrate.get();
    }

    public void setDivrate(String v) {
        divrate.set(v);
    }

    public String getShares() {
        return shares.get();
    }

    public void setShares(String v) {
        shares.set(v);
    }

    public String getShprice() {
        return shprice.get();
    }

    public void setShprice(String v) {
        shprice.set(v);
    }

    public String getTfee() {
        return tfee.get();
    }

    public void setTfee(String v) {
        tfee.set(v);
    }

    public String getTamt() {
        return tamt.get();
    }

    public void setTamt(String v) {
        tamt.set(v);
    }

    public String getNote() {
        return note.get();
    }

    public void setNote(String v) {
        note.set(v);
    }

    public String getTaxlot() {
        return taxlot.get();
    }

    public void setTaxlot(String v) {
        taxlot.set(v);
    }
}
