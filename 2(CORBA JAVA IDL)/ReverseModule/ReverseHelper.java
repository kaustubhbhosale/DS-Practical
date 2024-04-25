package ReverseModule;


/**
* ReverseModule/ReverseHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ReverseModule.idl
* Wednesday, 24 April, 2024 11:43:21 PM IST
*/

abstract public class ReverseHelper
{
  private static String  _id = "IDL:ReverseModule/Reverse:1.0";

  public static void insert (org.omg.CORBA.Any a, ReverseModule.Reverse that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ReverseModule.Reverse extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ReverseModule.ReverseHelper.id (), "Reverse");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ReverseModule.Reverse read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ReverseStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ReverseModule.Reverse value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ReverseModule.Reverse narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ReverseModule.Reverse)
      return (ReverseModule.Reverse)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ReverseModule._ReverseStub stub = new ReverseModule._ReverseStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ReverseModule.Reverse unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ReverseModule.Reverse)
      return (ReverseModule.Reverse)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ReverseModule._ReverseStub stub = new ReverseModule._ReverseStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
