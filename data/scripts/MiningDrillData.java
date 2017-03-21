// ORM class for table 'MiningDrillData'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Mar 05 02:15:06 PST 2016
// For connector: org.apache.sqoop.manager.DirectMySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MiningDrillData extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String FileName;
  public String get_FileName() {
    return FileName;
  }
  public void set_FileName(String FileName) {
    this.FileName = FileName;
  }
  public MiningDrillData with_FileName(String FileName) {
    this.FileName = FileName;
    return this;
  }
  private Double Depth;
  public Double get_Depth() {
    return Depth;
  }
  public void set_Depth(Double Depth) {
    this.Depth = Depth;
  }
  public MiningDrillData with_Depth(Double Depth) {
    this.Depth = Depth;
    return this;
  }
  private Double Backforce;
  public Double get_Backforce() {
    return Backforce;
  }
  public void set_Backforce(Double Backforce) {
    this.Backforce = Backforce;
  }
  public MiningDrillData with_Backforce(Double Backforce) {
    this.Backforce = Backforce;
    return this;
  }
  private String Comments;
  public String get_Comments() {
    return Comments;
  }
  public void set_Comments(String Comments) {
    this.Comments = Comments;
  }
  public MiningDrillData with_Comments(String Comments) {
    this.Comments = Comments;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MiningDrillData)) {
      return false;
    }
    MiningDrillData that = (MiningDrillData) o;
    boolean equal = true;
    equal = equal && (this.FileName == null ? that.FileName == null : this.FileName.equals(that.FileName));
    equal = equal && (this.Depth == null ? that.Depth == null : this.Depth.equals(that.Depth));
    equal = equal && (this.Backforce == null ? that.Backforce == null : this.Backforce.equals(that.Backforce));
    equal = equal && (this.Comments == null ? that.Comments == null : this.Comments.equals(that.Comments));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MiningDrillData)) {
      return false;
    }
    MiningDrillData that = (MiningDrillData) o;
    boolean equal = true;
    equal = equal && (this.FileName == null ? that.FileName == null : this.FileName.equals(that.FileName));
    equal = equal && (this.Depth == null ? that.Depth == null : this.Depth.equals(that.Depth));
    equal = equal && (this.Backforce == null ? that.Backforce == null : this.Backforce.equals(that.Backforce));
    equal = equal && (this.Comments == null ? that.Comments == null : this.Comments.equals(that.Comments));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.FileName = JdbcWritableBridge.readString(1, __dbResults);
    this.Depth = JdbcWritableBridge.readDouble(2, __dbResults);
    this.Backforce = JdbcWritableBridge.readDouble(3, __dbResults);
    this.Comments = JdbcWritableBridge.readString(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.FileName = JdbcWritableBridge.readString(1, __dbResults);
    this.Depth = JdbcWritableBridge.readDouble(2, __dbResults);
    this.Backforce = JdbcWritableBridge.readDouble(3, __dbResults);
    this.Comments = JdbcWritableBridge.readString(4, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(FileName, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(Depth, 2 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Backforce, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(Comments, 4 + __off, 12, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(FileName, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(Depth, 2 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(Backforce, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(Comments, 4 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.FileName = null;
    } else {
    this.FileName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Depth = null;
    } else {
    this.Depth = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Backforce = null;
    } else {
    this.Backforce = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Comments = null;
    } else {
    this.Comments = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.FileName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FileName);
    }
    if (null == this.Depth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Depth);
    }
    if (null == this.Backforce) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Backforce);
    }
    if (null == this.Comments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Comments);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.FileName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FileName);
    }
    if (null == this.Depth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Depth);
    }
    if (null == this.Backforce) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.Backforce);
    }
    if (null == this.Comments) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Comments);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 124, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(FileName==null?"null":FileName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Depth==null?"null":"" + Depth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Backforce==null?"null":"" + Backforce, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Comments==null?"null":Comments, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(FileName==null?"null":FileName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Depth==null?"null":"" + Depth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Backforce==null?"null":"" + Backforce, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Comments==null?"null":Comments, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 124, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FileName = null; } else {
      this.FileName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Depth = null; } else {
      this.Depth = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Backforce = null; } else {
      this.Backforce = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Comments = null; } else {
      this.Comments = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FileName = null; } else {
      this.FileName = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Depth = null; } else {
      this.Depth = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Backforce = null; } else {
      this.Backforce = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Comments = null; } else {
      this.Comments = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    MiningDrillData o = (MiningDrillData) super.clone();
    return o;
  }

  public void clone0(MiningDrillData o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("FileName", this.FileName);
    __sqoop$field_map.put("Depth", this.Depth);
    __sqoop$field_map.put("Backforce", this.Backforce);
    __sqoop$field_map.put("Comments", this.Comments);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("FileName", this.FileName);
    __sqoop$field_map.put("Depth", this.Depth);
    __sqoop$field_map.put("Backforce", this.Backforce);
    __sqoop$field_map.put("Comments", this.Comments);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("FileName".equals(__fieldName)) {
      this.FileName = (String) __fieldVal;
    }
    else    if ("Depth".equals(__fieldName)) {
      this.Depth = (Double) __fieldVal;
    }
    else    if ("Backforce".equals(__fieldName)) {
      this.Backforce = (Double) __fieldVal;
    }
    else    if ("Comments".equals(__fieldName)) {
      this.Comments = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("FileName".equals(__fieldName)) {
      this.FileName = (String) __fieldVal;
      return true;
    }
    else    if ("Depth".equals(__fieldName)) {
      this.Depth = (Double) __fieldVal;
      return true;
    }
    else    if ("Backforce".equals(__fieldName)) {
      this.Backforce = (Double) __fieldVal;
      return true;
    }
    else    if ("Comments".equals(__fieldName)) {
      this.Comments = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
