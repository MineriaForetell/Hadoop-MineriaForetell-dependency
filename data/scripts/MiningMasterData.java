// ORM class for table 'MiningMasterData'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Mar 05 01:49:17 PST 2016
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

public class MiningMasterData extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String PointID;
  public String get_PointID() {
    return PointID;
  }
  public void set_PointID(String PointID) {
    this.PointID = PointID;
  }
  public MiningMasterData with_PointID(String PointID) {
    this.PointID = PointID;
    return this;
  }
  private Integer PointX;
  public Integer get_PointX() {
    return PointX;
  }
  public void set_PointX(Integer PointX) {
    this.PointX = PointX;
  }
  public MiningMasterData with_PointX(Integer PointX) {
    this.PointX = PointX;
    return this;
  }
  private Integer PointY;
  public Integer get_PointY() {
    return PointY;
  }
  public void set_PointY(Integer PointY) {
    this.PointY = PointY;
  }
  public MiningMasterData with_PointY(Integer PointY) {
    this.PointY = PointY;
    return this;
  }
  private String FileName;
  public String get_FileName() {
    return FileName;
  }
  public void set_FileName(String FileName) {
    this.FileName = FileName;
  }
  public MiningMasterData with_FileName(String FileName) {
    this.FileName = FileName;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MiningMasterData)) {
      return false;
    }
    MiningMasterData that = (MiningMasterData) o;
    boolean equal = true;
    equal = equal && (this.PointID == null ? that.PointID == null : this.PointID.equals(that.PointID));
    equal = equal && (this.PointX == null ? that.PointX == null : this.PointX.equals(that.PointX));
    equal = equal && (this.PointY == null ? that.PointY == null : this.PointY.equals(that.PointY));
    equal = equal && (this.FileName == null ? that.FileName == null : this.FileName.equals(that.FileName));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MiningMasterData)) {
      return false;
    }
    MiningMasterData that = (MiningMasterData) o;
    boolean equal = true;
    equal = equal && (this.PointID == null ? that.PointID == null : this.PointID.equals(that.PointID));
    equal = equal && (this.PointX == null ? that.PointX == null : this.PointX.equals(that.PointX));
    equal = equal && (this.PointY == null ? that.PointY == null : this.PointY.equals(that.PointY));
    equal = equal && (this.FileName == null ? that.FileName == null : this.FileName.equals(that.FileName));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.PointID = JdbcWritableBridge.readString(1, __dbResults);
    this.PointX = JdbcWritableBridge.readInteger(2, __dbResults);
    this.PointY = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FileName = JdbcWritableBridge.readString(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.PointID = JdbcWritableBridge.readString(1, __dbResults);
    this.PointX = JdbcWritableBridge.readInteger(2, __dbResults);
    this.PointY = JdbcWritableBridge.readInteger(3, __dbResults);
    this.FileName = JdbcWritableBridge.readString(4, __dbResults);
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
    JdbcWritableBridge.writeString(PointID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(PointX, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(PointY, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FileName, 4 + __off, 12, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(PointID, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(PointX, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(PointY, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FileName, 4 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.PointID = null;
    } else {
    this.PointID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PointX = null;
    } else {
    this.PointX = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.PointY = null;
    } else {
    this.PointY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FileName = null;
    } else {
    this.FileName = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.PointID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PointID);
    }
    if (null == this.PointX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.PointX);
    }
    if (null == this.PointY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.PointY);
    }
    if (null == this.FileName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FileName);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.PointID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PointID);
    }
    if (null == this.PointX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.PointX);
    }
    if (null == this.PointY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.PointY);
    }
    if (null == this.FileName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FileName);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(PointID==null?"null":PointID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PointX==null?"null":"" + PointX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PointY==null?"null":"" + PointY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FileName==null?"null":FileName, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(PointID==null?"null":PointID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PointX==null?"null":"" + PointX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PointY==null?"null":"" + PointY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FileName==null?"null":FileName, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null")) { this.PointID = null; } else {
      this.PointID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PointX = null; } else {
      this.PointX = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PointY = null; } else {
      this.PointY = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FileName = null; } else {
      this.FileName = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PointID = null; } else {
      this.PointID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PointX = null; } else {
      this.PointX = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PointY = null; } else {
      this.PointY = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FileName = null; } else {
      this.FileName = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    MiningMasterData o = (MiningMasterData) super.clone();
    return o;
  }

  public void clone0(MiningMasterData o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("PointID", this.PointID);
    __sqoop$field_map.put("PointX", this.PointX);
    __sqoop$field_map.put("PointY", this.PointY);
    __sqoop$field_map.put("FileName", this.FileName);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("PointID", this.PointID);
    __sqoop$field_map.put("PointX", this.PointX);
    __sqoop$field_map.put("PointY", this.PointY);
    __sqoop$field_map.put("FileName", this.FileName);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("PointID".equals(__fieldName)) {
      this.PointID = (String) __fieldVal;
    }
    else    if ("PointX".equals(__fieldName)) {
      this.PointX = (Integer) __fieldVal;
    }
    else    if ("PointY".equals(__fieldName)) {
      this.PointY = (Integer) __fieldVal;
    }
    else    if ("FileName".equals(__fieldName)) {
      this.FileName = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("PointID".equals(__fieldName)) {
      this.PointID = (String) __fieldVal;
      return true;
    }
    else    if ("PointX".equals(__fieldName)) {
      this.PointX = (Integer) __fieldVal;
      return true;
    }
    else    if ("PointY".equals(__fieldName)) {
      this.PointY = (Integer) __fieldVal;
      return true;
    }
    else    if ("FileName".equals(__fieldName)) {
      this.FileName = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
