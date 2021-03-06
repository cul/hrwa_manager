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
 * Generated by Zebulun ASN1tojava: 1998-09-08 03:15:12 UTC
 */

//----------------------------------------------------------------

package z3950.DiagFormat;
import asn1.*;
import z3950.v3.AttributeList;
import z3950.v3.DatabaseName;
import z3950.v3.DefaultDiagFormat;
import z3950.v3.InternationalString;
import z3950.v3.SortElement;
import z3950.v3.Specification;
import z3950.v3.Term;

//================================================================
/**
 * Class for representing a <code>DiagFormat</code> from <code>DiagnosticFormatDiag1</code>
 *
 * <pre>
 * DiagFormat ::=
 * CHOICE {
 *   tooMany [1000] IMPLICIT DiagFormat_tooMany
 *   badSpec [1001] IMPLICIT DiagFormat_badSpec
 *   dbUnavail [1002] IMPLICIT DiagFormat_dbUnavail
 *   unSupOp [1003] IMPLICIT INTEGER
 *   attribute [1004] IMPLICIT DiagFormat_attribute
 *   attCombo [1005] IMPLICIT DiagFormat_attCombo
 *   term [1006] IMPLICIT DiagFormat_term
 *   proximity [1007] EXPLICIT DiagFormat_proximity
 *   scan [1008] EXPLICIT DiagFormat_scan
 *   sort [1009] EXPLICIT DiagFormat_sort
 *   segmentation [1010] EXPLICIT DiagFormat_segmentation
 *   extServices [1011] EXPLICIT DiagFormat_extServices
 *   accessCtrl [1012] EXPLICIT DiagFormat_accessCtrl
 *   recordSyntax [1013] IMPLICIT DiagFormat_recordSyntax
 * }
 * </pre>
 *
 * @version	$Release$ $Date$
 */

//----------------------------------------------------------------

public final class DiagFormat extends ASN1Any
{

  public final static String VERSION = "Copyright (C) Hoylen Sue, 1998. 199809080315Z";

//----------------------------------------------------------------
/**
 * Default constructor for a DiagFormat.
 */

public
DiagFormat()
{
}

//----------------------------------------------------------------
/**
 * Constructor for a DiagFormat from a BER encoding.
 * <p>
 *
 * @param ber the BER encoding.
 * @param check_tag will check tag if true, use false
 *         if the BER has been implicitly tagged. You should
 *         usually be passing true.
 * @exception	ASN1Exception if the BER encoding is bad.
 */

public
DiagFormat(BEREncoding ber, boolean check_tag)
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
  BERConstructed tagwrapper;

  // Null out all choices

  c_tooMany = null;
  c_badSpec = null;
  c_dbUnavail = null;
  c_unSupOp = null;
  c_attribute = null;
  c_attCombo = null;
  c_term = null;
  c_proximity = null;
  c_scan = null;
  c_sort = null;
  c_segmentation = null;
  c_extServices = null;
  c_accessCtrl = null;
  c_recordSyntax = null;

  // Try choice tooMany
  if (ber.tag_get() == 1000 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_tooMany = new DiagFormat_tooMany(ber, false);
    return;
  }

  // Try choice badSpec
  if (ber.tag_get() == 1001 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_badSpec = new DiagFormat_badSpec(ber, false);
    return;
  }

  // Try choice dbUnavail
  if (ber.tag_get() == 1002 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_dbUnavail = new DiagFormat_dbUnavail(ber, false);
    return;
  }

  // Try choice unSupOp
  if (ber.tag_get() == 1003 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_unSupOp = new ASN1Integer(ber, false);
    return;
  }

  // Try choice attribute
  if (ber.tag_get() == 1004 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_attribute = new DiagFormat_attribute(ber, false);
    return;
  }

  // Try choice attCombo
  if (ber.tag_get() == 1005 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_attCombo = new DiagFormat_attCombo(ber, false);
    return;
  }

  // Try choice term
  if (ber.tag_get() == 1006 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_term = new DiagFormat_term(ber, false);
    return;
  }

  // Try choice proximity
  if (ber.tag_get() == 1007 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagwrapper = (BERConstructed) ber;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    }
    if (tagwrapper.number_components() != 1)
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    c_proximity = new DiagFormat_proximity(tagwrapper.elementAt(0), true);
    return;
  }

  // Try choice scan
  if (ber.tag_get() == 1008 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagwrapper = (BERConstructed) ber;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    }
    if (tagwrapper.number_components() != 1)
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    c_scan = new DiagFormat_scan(tagwrapper.elementAt(0), true);
    return;
  }

  // Try choice sort
  if (ber.tag_get() == 1009 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagwrapper = (BERConstructed) ber;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    }
    if (tagwrapper.number_components() != 1)
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    c_sort = new DiagFormat_sort(tagwrapper.elementAt(0), true);
    return;
  }

  // Try choice segmentation
  if (ber.tag_get() == 1010 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagwrapper = (BERConstructed) ber;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    }
    if (tagwrapper.number_components() != 1)
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    c_segmentation = new DiagFormat_segmentation(tagwrapper.elementAt(0), true);
    return;
  }

  // Try choice extServices
  if (ber.tag_get() == 1011 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagwrapper = (BERConstructed) ber;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    }
    if (tagwrapper.number_components() != 1)
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    c_extServices = new DiagFormat_extServices(tagwrapper.elementAt(0), true);
    return;
  }

  // Try choice accessCtrl
  if (ber.tag_get() == 1012 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    try {
      tagwrapper = (BERConstructed) ber;
    } catch (ClassCastException e) {
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    }
    if (tagwrapper.number_components() != 1)
      throw new ASN1EncodingException
        ("Zebulun DiagFormat: bad BER form\n");
    c_accessCtrl = new DiagFormat_accessCtrl(tagwrapper.elementAt(0), true);
    return;
  }

  // Try choice recordSyntax
  if (ber.tag_get() == 1013 &&
      ber.tag_type_get() == BEREncoding.CONTEXT_SPECIFIC_TAG) {
    c_recordSyntax = new DiagFormat_recordSyntax(ber, false);
    return;
  }

  throw new ASN1Exception("Zebulun DiagFormat: bad BER encoding: choice not matched");
}

//----------------------------------------------------------------
/**
 * Returns a BER encoding of DiagFormat.
 *
 * @return	The BER encoding.
 * @exception	ASN1Exception Invalid or cannot be encoded.
 */

public BEREncoding
ber_encode()
       throws ASN1Exception
{
  BEREncoding chosen = null;

  BEREncoding enc[];

  // Encoding choice: c_tooMany
  if (c_tooMany != null) {
    chosen = c_tooMany.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1000);
  }

  // Encoding choice: c_badSpec
  if (c_badSpec != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    chosen = c_badSpec.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1001);
  }

  // Encoding choice: c_dbUnavail
  if (c_dbUnavail != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    chosen = c_dbUnavail.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1002);
  }

  // Encoding choice: c_unSupOp
  if (c_unSupOp != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    chosen = c_unSupOp.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1003);
  }

  // Encoding choice: c_attribute
  if (c_attribute != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    chosen = c_attribute.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1004);
  }

  // Encoding choice: c_attCombo
  if (c_attCombo != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    chosen = c_attCombo.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1005);
  }

  // Encoding choice: c_term
  if (c_term != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    chosen = c_term.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1006);
  }

  // Encoding choice: c_proximity
  if (c_proximity != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    enc = new BEREncoding[1];
    enc[0] = c_proximity.ber_encode();
    chosen = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 1007, enc);
  }

  // Encoding choice: c_scan
  if (c_scan != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    enc = new BEREncoding[1];
    enc[0] = c_scan.ber_encode();
    chosen = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 1008, enc);
  }

  // Encoding choice: c_sort
  if (c_sort != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    enc = new BEREncoding[1];
    enc[0] = c_sort.ber_encode();
    chosen = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 1009, enc);
  }

  // Encoding choice: c_segmentation
  if (c_segmentation != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    enc = new BEREncoding[1];
    enc[0] = c_segmentation.ber_encode();
    chosen = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 1010, enc);
  }

  // Encoding choice: c_extServices
  if (c_extServices != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    enc = new BEREncoding[1];
    enc[0] = c_extServices.ber_encode();
    chosen = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 1011, enc);
  }

  // Encoding choice: c_accessCtrl
  if (c_accessCtrl != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    enc = new BEREncoding[1];
    enc[0] = c_accessCtrl.ber_encode();
    chosen = new BERConstructed(BEREncoding.CONTEXT_SPECIFIC_TAG, 1012, enc);
  }

  // Encoding choice: c_recordSyntax
  if (c_recordSyntax != null) {
    if (chosen != null)
      throw new ASN1Exception("CHOICE multiply set");
    chosen = c_recordSyntax.ber_encode(BEREncoding.CONTEXT_SPECIFIC_TAG, 1013);
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

  throw new ASN1EncodingException("Zebulun DiagFormat: cannot implicitly tag");
}

//----------------------------------------------------------------
/**
 * Returns a new String object containing a text representing
 * of the DiagFormat. 
 */

public String
toString()
{
  StringBuffer str = new StringBuffer("{");

  boolean found = false;

  if (c_tooMany != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: tooMany> ");
    found = true;
    str.append("tooMany ");
  str.append(c_tooMany);
  }

  if (c_badSpec != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: badSpec> ");
    found = true;
    str.append("badSpec ");
  str.append(c_badSpec);
  }

  if (c_dbUnavail != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: dbUnavail> ");
    found = true;
    str.append("dbUnavail ");
  str.append(c_dbUnavail);
  }

  if (c_unSupOp != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: unSupOp> ");
    found = true;
    str.append("unSupOp ");
  str.append(c_unSupOp);
  }

  if (c_attribute != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: attribute> ");
    found = true;
    str.append("attribute ");
  str.append(c_attribute);
  }

  if (c_attCombo != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: attCombo> ");
    found = true;
    str.append("attCombo ");
  str.append(c_attCombo);
  }

  if (c_term != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: term> ");
    found = true;
    str.append("term ");
  str.append(c_term);
  }

  if (c_proximity != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: proximity> ");
    found = true;
    str.append("proximity ");
  str.append(c_proximity);
  }

  if (c_scan != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: scan> ");
    found = true;
    str.append("scan ");
  str.append(c_scan);
  }

  if (c_sort != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: sort> ");
    found = true;
    str.append("sort ");
  str.append(c_sort);
  }

  if (c_segmentation != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: segmentation> ");
    found = true;
    str.append("segmentation ");
  str.append(c_segmentation);
  }

  if (c_extServices != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: extServices> ");
    found = true;
    str.append("extServices ");
  str.append(c_extServices);
  }

  if (c_accessCtrl != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: accessCtrl> ");
    found = true;
    str.append("accessCtrl ");
  str.append(c_accessCtrl);
  }

  if (c_recordSyntax != null) {
    if (found)
      str.append("<ERROR: multiple CHOICE: recordSyntax> ");
    found = true;
    str.append("recordSyntax ");
  str.append(c_recordSyntax);
  }

  str.append("}");

  return str.toString();
}

//----------------------------------------------------------------
/*
 * Internal variables for class.
 */

public DiagFormat_tooMany c_tooMany;
public DiagFormat_badSpec c_badSpec;
public DiagFormat_dbUnavail c_dbUnavail;
public ASN1Integer c_unSupOp;
public DiagFormat_attribute c_attribute;
public DiagFormat_attCombo c_attCombo;
public DiagFormat_term c_term;
public DiagFormat_proximity c_proximity;
public DiagFormat_scan c_scan;
public DiagFormat_sort c_sort;
public DiagFormat_segmentation c_segmentation;
public DiagFormat_extServices c_extServices;
public DiagFormat_accessCtrl c_accessCtrl;
public DiagFormat_recordSyntax c_recordSyntax;

//----------------------------------------------------------------
/*
 * Enumerated constants for class.
 */

// Enumerated constants for unSupOp
public static final int E_and = 0;
public static final int E_or = 1;
public static final int E_and_not = 2;
public static final int E_prox = 3;

} // DiagFormat

//----------------------------------------------------------------
//EOF
