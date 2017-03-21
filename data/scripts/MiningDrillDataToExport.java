// ORM class for table 'MiningDrillDataToExport'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Mar 05 02:15:33 PST 2016
// For connector: org.apache.sqoop.manager.MySQLManager
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

public class MiningDrillDataToExport extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Double PointZ;
  public Double get_PointZ() {
    return PointZ;
  }
  public void set_PointZ(Double PointZ) {
    this.PointZ = PointZ;
  }
  public MiningDrillDataToExport with_PointZ(Double PointZ) {
    this.PointZ = PointZ;
    return this;
  }
  private Double PointY;
  public Double get_PointY() {
    return PointY;
  }
  public void set_PointY(Double PointY) {
    this.PointY = PointY;
  }
  public MiningDrillDataToExport with_PointY(Double PointY) {
    this.PointY = PointY;
    return this;
  }
  private Double PointX;
  public Double get_PointX() {
    return PointX;
  }
  public void set_PointX(Double PointX) {
    this.PointX = PointX;
  }
  public MiningDrillDataToExport with_PointX(Double PointX) {
    this.PointX = PointX;
    return this;
  }
  private String Material;
  public String get_Material() {
    return Material;
  }
  public void set_Material(String Material) {
    this.Material = Material;
  }
  public MiningDrillDataToExport with_Material(String Material) {
    this.Material = Material;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MiningDrillDataToExport)) {
      return false;
    }
    MiningDrillDataToExport that = (MiningDrillDataToExport) o;
    boolean equal = true;
    equal = equal && (this.PointZ == null ? that.PointZ == null : this.PointZ.equals(that.PointZ));
    equal = equal && (this.PointY == null ? that.PointY == null : this.PointY.equals(that.PointY));
    equal = equal && (this.PointX == null ? that.PointX == null : this.PointX.equals(that.PointX));
    equal = equal && (this.Material == null ? that.Material == null : this.Material.equals(that.Material));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MiningDrillDataToExport)) {
      return false;
    }
    MiningDrillDataToExport that = (MiningDrillDataToExport) o;
    boolean equal = true;
    equal = equal && (this.PointZ == null ? that.PointZ == null : this.PointZ.equals(that.PointZ));
    equal = equal && (this.PointY == null ? that.PointY == null : this.PointY.equals(that.PointY));
    equal = equal && (this.PointX == null ? that.PointX == null : this.PointX.equals(that.PointX));
    equal = equal && (this.Material == null ? that.Material == null : this.Material.equals(that.Material));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.PointZ = JdbcWritableBridge.readDouble(1, __dbResults);
    this.PointY = JdbcWritableBridge.readDouble(2, __dbResults);
    this.PointX = JdbcWritableBridge.readDouble(3, __dbResults);
    this.Material = JdbcWritableBridge.readString(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.PointZ = JdbcWritableBridge.readDouble(1, __dbResults);
    this.PointY = JdbcWritableBridge.readDouble(2, __dbResults);
    this.PointX = JdbcWritableBridge.readDouble(3, __dbResults);
    this.Material = JdbcWritableBridge.readString(4, __dbResults);
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
    JdbcWritableBridge.writeDouble(PointZ, 1 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(PointY, 2 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(PointX, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(Material, 4 + __off, 12, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDouble(PointZ, 1 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(PointY, 2 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(PointX, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(Material, 4 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.PointZ = null;
    } else {
    this.PointZ = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.PointY = null;
    } else {
    this.PointY = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.PointX = null;
    } else {
    this.PointX = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.Material = null;
    } else {
    this.Material = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.PointZ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.PointZ);
    }
    if (null == this.PointY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.PointY);
    }
    if (null == this.PointX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.PointX);
    }
    if (null == this.Material) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Material);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.PointZ) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.PointZ);
    }
    if (null == this.PointY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.PointY);
    }
    if (null == this.PointX) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.PointX);
    }
    if (null == this.Material) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Material);
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
    __sb.append(FieldFormatter.escapeAndEnclose(PointZ==null?"null":"" + PointZ, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PointY==null?"null":"" + PointY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PointX==null?"null":"" + PointX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Material==null?"null":Material, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(PointZ==null?"null":"" + PointZ, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PointY==null?"null":"" + PointY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PointX==null?"null":"" + PointX, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Material==null?"null":Material, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PointZ = null; } else {
      this.PointZ = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PointY = null; } else {
      this.PointY = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PointX = null; } else {
      this.PointX = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Material = null; } else {
      this.Material = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PointZ = null; } else {
      this.PointZ = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PointY = null; } else {
      this.PointY = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PointX = null; } else {
      this.PointX = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Material = null; } else {
      this.Material = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    MiningDrillDataToExport o = (MiningDrillDataToExport) super.clone();
    return o;
  }

  public void clone0(MiningDrillDataToExport o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("PointZ", this.PointZ);
    __sqoop$field_map.put("PointY", this.PointY);
    __sqoop$field_map.put("PointX", this.PointX);
    __sqoop$field_map.put("Material", this.Material);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("PointZ", this.PointZ);
    __sqoop$field_map.put("PointY", this.PointY);
    __sqoop$field_map.put("PointX", this.PointX);
    __sqoop$field_map.put("Material", this.Material);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("PointZ".equals(__fieldName)) {
      this.PointZ = (Double) __fieldVal;
    }
    else    if ("PointY".equals(__fieldName)) {
      this.PointY = (Double) __fieldVal;
    }
    else    if ("PointX".equals(__fieldName)) {
      this.PointX = (Double) __fieldVal;
    }
    else    if ("Material".equals(__fieldName)) {
      this.Material = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("PointZ".equals(__fieldName)) {
      this.PointZ = (Double) __fieldVal;
      return true;
    }
    else    if ("PointY".equals(__fieldName)) {
      this.PointY = (Double) __fieldVal;
      return true;
    }
    else    if ("PointX".equals(__fieldName)) {
      this.PointX = (Double) __fieldVal;
      return true;
    }
    else    if ("Material".equals(__fieldName)) {
      this.Material = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
