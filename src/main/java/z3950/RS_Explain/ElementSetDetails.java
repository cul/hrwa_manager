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
 * Generated by Zebulun ASN1tojava: 1998-09-08 03:15:15 UTC
 */

//----------------------------------------------------------------

package z3950.RS_Explain;
import asn1.*;
import z3950.v3.AttributeElement;
import z3950.v3.AttributeList;
import z3950.v3.AttributeSetId;
import z3950.v3.DatabaseName;
import z3950.v3.ElementSetName;
import z3950.v3.IntUnit;
import z3950.v3.InternationalString;
import z3950.v3.OtherInformation;
import z3950.v3.Specification;
import z3950.v3.StringOrNumeric;
import z3950.v3.Term;
import z3950.v3.Unit;

//================================================================
/**
 * Class for representing a <code>ElementSetDetails</code> from <code>RecordSyntax-explain</code>
 *
 * <pre>
 * ElementSetDetails ::=
 * SEQUENCE {
 *   commonInfo [0] IMPLICIT CommonInfo OPTIONAL
 *   databaseName [1] IMPLICIT DatabaseName
 *   elementSetName [2] IMPLICIT ElementSetName
 *   recordSyntax [3] IMPLICIT OBJECT IDENTIFIER
 *   schema [4] IMPLICIT OBJECT IDENTIFIER
 *   description [5] IMPLICIT HumanString OPTIONAL
 *   detailsPerElement [6] IMPLICIT SEQUENCE OF PerElementDetails OPTIONAL
 * }
 * </pre>
 *
 * @version	$Release$ $Date$
 */

//----------------------------------------------------------------

public final class ElementSetDetails extends ASN1Any
{

  public final static String VERSION = "Copyright (C) Hoylen Sue, 1998. 199809080315Z";

//----------------------------------------------------------------
/**
 * Default constructor for a ElementSetDetails.
 */

public
ElementSetDetails()
{
}

//----------------------------------------------------------------
/**
 * Constructor for a ElementSetDetails from a BER encoding.
 * <p>
 *
 * @param ber the BER encoding.
 * @param check_tag will check tag if true, use false
 *         if the BER has been implicitly tagged. You should
 *         usually be passing true.
 * @exception	ASN1Exception if the BER encoding is bad.
 */

public
ElementSetDetails(BEREncoding ber, boolean check_tag)
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
  // ElementSetDetails should be encoded by a constructed BER

  BERConstructed ber_cons;
  try {
    ber_cons = (BERConstructed) ber;
  } catch (ClassCastException e) {
    throw new ASN1EncodingException
      ("Zebulun ElementSetDetails: bad BER form\n");
  }

  // Prepare to decode the components

  int num_parts = ber_cons.number_components();
  int part = 0;
  BEREncoding p;

  // Decoding: commonInfo [0] IMPLICIT CommonInfo OPTIONAL

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun ElementSetDetails: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() == 0 &&
      p.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    s_commonInfo = new CommonInfo(p, false);
    part++;
  }

  // Decoding: databaseName [1] IMPLICIT DatabaseName

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun ElementSetDetails: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() != 1 ||
      p.tag_type_get() != BEREncoding.CONTEXT_SPECIFIC_TAG)
    throw new ASN1EncodingException
      ("Zebulun ElementSetDetails: bad tag in s_databaseName\n");

  s_databaseName = new DatabaseName(p, false);
  part++;

  // Decoding: elementSetName [2] IMPLICIT ElementSetName

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun ElementSetDetails: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() != 2 ||
      p.tag_type_get() != BEREncoding.CONTEXT_SPECIFIC_TAG)
    throw new ASN1EncodingException
      ("Zebulun ElementSetDetails: bad tag in s_elementSetName\n");

  s_elementSetName = new ElementSetName(p, false);
  part++;

  // Decoding: recordSyntax [3] IMPLICIT OBJECT IDENTIFIER

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun ElementSetDetails: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() != 3 ||
      p.tag_type_get() != BEREncoding.CONTEXT_SPECIFIC_TAG)
    throw new ASN1EncodingException
      ("Zebulun ElementSetDetails: bad tag in s_recordSyntax\n");

  s_recordSyntax = new ASN1ObjectIdentifier(p, false);
  part++;

  // Decoding: schema [4] IMPLICIT OBJECT IDENTIFIER

  if (num_parts <= part) {
    // End of record, but still more elements to get
    throw new ASN1Exception("Zebulun ElementSetDetails: incomplete");
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() != 4 ||
      p.tag_type_get() != BEREncoding.CONTEXT_SPECIFIC_TAG)
    throw new ASN1EncodingException
      ("Zebulun ElementSetDetails: bad tag in s_schema\n");

  s_schema = new ASN1ObjectIdentifier(p, false);
  part++;

  // Remaining elements are optional, set variables
  // to null (not present) so can return at end of BER

  s_description = null;
  s_detailsPerElement = null;

  // Decoding: description [5] IMPLICIT HumanString OPTIONAL

  if (num_parts <= part) {
    return; // no more data, but ok (rest is optional)
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() == 5 &&
      p.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    s_description = new HumanString(p, false);
    part++;
  }

  // Decoding: detailsPerElement [6] IMPLICIT SEQUENCE OF PerElementDetails OPTIONAL

  if (num_parts <= part) {
    return; // no more data, but ok (rest is optional)
  }
  p = ber_cons.elementAt(part);

  if (p.tag_get() == 6 &&
      p.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      BERConstructed cons = (BERConstructed) p;
      int parts = cons.number_components();
      s_detailsPerElement = new PerElementDetails[parts];
      int n;
      for (n = 0; n < parts; n++) {
        s_detailsPerElement[n] = new PerElementDetails(cons.elementAt(n), true);
      }
    } catch (ClassCastException e) {
      throw new ASN1EncodingException("Bad BER");
    }
    part++;
  }

  // Should not be any more parts

  if (part < num_parts) {
    throw new ASN1Exception("Zebulun ElementSetDetails: bad BER: extra data " + part + "/" + num_parts + " processed");
  }
}

//----------------------------------------------------------------
/**
 * Returns a BER encoding of the ElementSetDetails.
 *
 * @exception	ASN1Exception Invalid or cannot be encoded.
 * @return	The BER encoding.
 */

public BEREncoding
ber_encode()
       throws ASN1Exception
{
  return ber_encode(BEREncoding.UNIVERSAL_TAG, ASN1Sequence.TAG);
}

//----------------------------------------------------------------
/**
 * Returns a BER encoding of ElementSetDetails, implicitly tagged.
 *
 * @param tag_type	The type of the implicit tag.
 * @param tag	The implicit tag.
 * @return	The BER encoding of the object.
 * @exception	ASN1Exception When invalid or cannot be encoded.
 * @see asn1.BEREncoding#UNIVERSAL_TAG
 * @see asn1.BEREncoding#APPLICATION_TAG
 * @see asn1.BEREncoding#CONTEXT_SPECIFIC_TAG
 * @see asn1.BEREncoding#PRIVATE_TAG
 */

public BEREncoding
ber_encode(int tag_type, int tag)
       throws ASN1Exception
{
  // Calculate the number of fields in the encoding

  int num_fields = 4; // number of mandatories
  if (s_commonInfo != null)
    num_fields++;
  if (s_description != null)
    num_fields++;
  if (s_detailsPerElement != null)
    num_fields++;

  // Encode it

  BEREncoding fields[] = new BEREncoding[num_fields];
  int x = 0;
  BEREncoding f2[];
  int p;

  // Encoding s_commonInfo: CommonInfo OPTIONAL

  if (s_commonInfo != null) {
    fields[x++] = s_commonInfo.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 0);
  }

  // Encoding s_databaseName: DatabaseName 

  fields[x++] = s_databaseName.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1);

  // Encoding s_elementSetName: ElementSetName 

  fields[x++] = s_elementSetName.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 2);

  // Encoding s_recordSyntax: OBJECT IDENTIFIER 

  fields[x++] = s_recordSyntax.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 3);

  // Encoding s_schema: OBJECT IDENTIFIER 

  fields[x++] = s_schema.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 4);

  // Encoding s_description: HumanString OPTIONAL

  if (s_description != null) {
    fields[x++] = s_description.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 5);
  }

  // Encoding s_detailsPerElement: SEQUENCE OF OPTIONAL

  if (s_detailsPerElement != null) {
    f2 = new BEREncoding[s_detailsPerElement.length];

    for (p = 0; p < s_detailsPerElement.length; p++) {
      f2[p] = s_detailsPerElement[p].ber_encode();
    }

    fields[x++] = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 6, f2);
  }

  return new BERConstructed(tag_type, tag, fields);
}

//----------------------------------------------------------------
/**
 * Returns a new String object containing a text representing
 * of the ElementSetDetails. 
 */

public String
toString()
{
  int p;
  StringBuffer str = new StringBuffer("{");
  int outputted = 0;

  if (s_commonInfo != null) {
    str.append("commonInfo ");
    str.append(s_commonInfo);
    outputted++;
  }

  if (0 < outputted)
    str.append(", ");
  str.append("databaseName ");
  str.append(s_databaseName);
  outputted++;

  if (0 < outputted)
    str.append(", ");
  str.append("elementSetName ");
  str.append(s_elementSetName);
  outputted++;

  if (0 < outputted)
    str.append(", ");
  str.append("recordSyntax ");
  str.append(s_recordSyntax);
  outputted++;

  if (0 < outputted)
    str.append(", ");
  str.append("schema ");
  str.append(s_schema);
  outputted++;

  if (s_description != null) {
    if (0 < outputted)
    str.append(", ");
    str.append("description ");
    str.append(s_description);
    outputted++;
  }

  if (s_detailsPerElement != null) {
    if (0 < outputted)
    str.append(", ");
    str.append("detailsPerElement ");
    str.append("{");
    for (p = 0; p < s_detailsPerElement.length; p++) {
      if (p != 0)
        str.append(", ");
      str.append(s_detailsPerElement[p]);
    }
    str.append("}");
    outputted++;
  }

  str.append("}");

  return str.toString();
}

//----------------------------------------------------------------
/*
 * Internal variables for class.
 */

public CommonInfo s_commonInfo; // optional
public DatabaseName s_databaseName;
public ElementSetName s_elementSetName;
public ASN1ObjectIdentifier s_recordSyntax;
public ASN1ObjectIdentifier s_schema;
public HumanString s_description; // optional
public PerElementDetails s_detailsPerElement[]; // optional

} // ElementSetDetails

//----------------------------------------------------------------
//EOF
