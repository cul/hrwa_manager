/*
 * $Source$
 * $Date$
 * $Revision$
 *
 * Copyright (C) 1998, Hoylen Sue.  All Rights Reserved.
 * <h.sue@ieee.org>
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  Refer to
 * the supplied license for more details.
 *
 * Generated by Zebulun ASN1tojava: 1998-09-08 03:15:23 UTC
 */

//----------------------------------------------------------------

package z3950.RS_opac;
import asn1.*;
import z3950.v3.InternationalString;

//================================================================
/**
 * Class for representing a <code>HoldingsRecord</code> from <code>RecordSyntax-opac</code>
 *
 * <pre>
 * HoldingsRecord ::=
 * CHOICE {
 *   marcHoldingsRecord [1] IMPLICIT EXTERNAL
 *   holdingsAndCirc [2] IMPLICIT HoldingsAndCircData
 * }
 * </pre>
 *
 * @version	$Release$ $Date$
 */

//----------------------------------------------------------------

public final class HoldingsRecord extends ASN1Any
{

  public final static String VERSION = "Copyright (C) Hoylen Sue, 1998. 199809080315Z";

//----------------------------------------------------------------
/**
 * Default constructor for a HoldingsRecord.
 */

public
HoldingsRecord()
{
}

//----------------------------------------------------------------
/**
 * Constructor for a HoldingsRecord from a BER encoding.
 * <p>
 *
 * @param ber the BER encoding.
 * @param check_tag will check tag if true, use false
 *         if the BER has been implicitly tagged. You should
 *         usually be passing true.
 * @exception	ASN1Exception if the BER encoding is bad.
 */

public
HoldingsRecord(BEREncoding ber, boolean check_tag)
       throws ASN1Exception
{
  super(ber, check_tag);
}

//----------------------------------------------------------------
/**
 * Initializing object from a BER encoding.
 * This method is for internal use only. You should use
 * the constructor that takes a BEREncoding.
 *
 * @param ber the BER to decode.
 * @param check_tag if the tag should be checked.
 * @exception ASN1Exception if the BER encoding is bad.
 */

public void
ber_decode(BEREncoding ber, boolean check_tag)
       throws ASN1Exception
{
  // Null out all choices

  c_marcHoldingsRecord = null;
  c_holdingsAndCirc = null;

  // Try choice marcHoldingsRecord
  if (ber.tag_get() == 1 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_marcHoldingsRecord = new ASN1External(ber, false);
    return;
  }

  // Try choice holdingsAndCirc
  if (ber.tag_get() == 2 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_holdingsAndCirc = new HoldingsAndCircData(ber, false);
    return;
  }

  throw new ASN1Exception("Zebulun HoldingsRecord: bad BER encoding: choice not matched");
}

//----------------------------------------------------------------
/**
 * Returns a BER encoding of HoldingsRecord.
 *
 * @return	The BER encoding.
 * @exception	ASN1Exception Invalid or cannot be encoded.
 */

public BEREncoding
ber_encode()
       throws ASN1Exception
{
  BEREncoding chosen = null;

  // Encoding choice: c_marcHoldingsRecord
  if (c_marcHoldingsRecord != null) {
    chosen = c_marcHoldingsRecord.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1);
  }

  // Encoding choice: c_holdingsAndCirc
  if (c_holdingsAndCirc != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    chosen = c_holdingsAndCirc.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 2);
  }

  // Check for error of having none of the choices set
  if (chosen == null)
    throw new ASN1Exception("CHOICE not set");

  return chosen;
}

//----------------------------------------------------------------

/**
 * Generating a BER encoding of the object
 * and implicitly tagging it.
 * <p>
 * This method is for internal use only. You should use
 * the ber_encode method that does not take a parameter.
 * <p>
 * This function should never be used, because this
 * production is a CHOICE.
 * It must never have an implicit tag.
 * <p>
 * An exception will be thrown if it is called.
 *
 * @param tag_type the type of the tag.
 * @param tag the tag.
 * @exception ASN1Exception if it cannot be BER encoded.
 */

public BEREncoding
ber_encode(int tag_type, int tag)
       throws ASN1Exception
{
  // This method must not be called!

  // Method is not available because this is a basic CHOICE
  // which does not have an explicit tag on it. So it is not
  // permitted to allow something else to apply an implicit
  // tag on it, otherwise the tag identifying which CHOICE
  // it is will be overwritten and lost.

  throw new ASN1EncodingException("Zebulun HoldingsRecord: cannot implicitly tag");
}

//----------------------------------------------------------------
/**
 * Returns a new String object containing a text representing
 * of the HoldingsRecord. 
 */

public String
toString()
{
  StringBuffer str = new StringBuffer("{");

  boolean found = false;

  if (c_marcHoldingsRecord != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: marcHoldingsRecord> ");
    found = true;
    str.append("marcHoldingsRecord ");
  str.append(c_marcHoldingsRecord);
  }

  if (c_holdingsAndCirc != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: holdingsAndCirc> ");
    found = true;
    str.append("holdingsAndCirc ");
  str.append(c_holdingsAndCirc);
  }

  str.append("}");

  return str.toString();
}

//----------------------------------------------------------------
/*
 * Internal variables for class.
 */

public ASN1External c_marcHoldingsRecord;
public HoldingsAndCircData c_holdingsAndCirc;

} // HoldingsRecord

//----------------------------------------------------------------
//EOF
