package html4k

import html4k.*
import html4k.impl.*
import html4k.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public fun <T, C : TagConsumer<T>> C.a(href : String? = null, target : String? = null, classes : Set<String>? = null, block : A.() -> Unit) : T = build(listOf("href" to href,"target" to target,"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildA, block).finalize()

public fun <T, C : TagConsumer<T>> C.abbr(classes : Set<String>? = null, block : ABBR.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildABBR, block).finalize()

public fun <T, C : TagConsumer<T>> C.address(classes : Set<String>? = null, block : ADDRESS.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildADDRESS, block).finalize()

public fun <T, C : TagConsumer<T>> C.area(shape : AreaShape? = null, alt : String? = null, classes : Set<String>? = null, content : String = "") : T = build(listOf("Shape" to shape?.enumEncode(),"alt" to alt,"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildAREA, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.area(shape : AreaShape? = null, alt : String? = null, classes : Set<String>? = null, block : AREA.() -> Unit) : T = build(listOf("Shape" to shape?.enumEncode(),"alt" to alt,"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildAREA, block).finalize()

public fun <T, C : TagConsumer<T>> C.article(classes : Set<String>? = null, block : ARTICLE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildARTICLE, block).finalize()

public fun <T, C : TagConsumer<T>> C.aside(classes : Set<String>? = null, block : ASIDE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildASIDE, block).finalize()

public fun <T, C : TagConsumer<T>> C.audio(classes : Set<String>? = null, block : AUDIO.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildAUDIO, block).finalize()

public fun <T, C : TagConsumer<T>> C.b(classes : Set<String>? = null, block : B.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildB, block).finalize()

public fun <T, C : TagConsumer<T>> C.base(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildBASE, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.base(classes : Set<String>? = null, block : BASE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildBASE, block).finalize()

public fun <T, C : TagConsumer<T>> C.bdi(classes : Set<String>? = null, block : BDI.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildBDI, block).finalize()

public fun <T, C : TagConsumer<T>> C.bdo(classes : Set<String>? = null, block : BDO.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildBDO, block).finalize()

public fun <T, C : TagConsumer<T>> C.blockQuote(classes : Set<String>? = null, block : BLOCKQUOTE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildBLOCKQUOTE, block).finalize()

public fun <T, C : TagConsumer<T>> C.body(classes : Set<String>? = null, block : BODY.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildBODY, block).finalize()

public fun <T, C : TagConsumer<T>> C.br(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildBR, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.br(classes : Set<String>? = null, block : BR.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildBR, block).finalize()

public fun <T, C : TagConsumer<T>> C.button(formEncType : ButtonFormEncType? = null, formMethod : ButtonFormMethod? = null, type : ButtonType? = null, classes : Set<String>? = null, block : BUTTON.() -> Unit) : T = build(listOf("formenctype" to formEncType?.enumEncode(),"formmethod" to formMethod?.enumEncode(),"type" to type?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildBUTTON, block).finalize()

public fun <T, C : TagConsumer<T>> C.canvas(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildCANVAS, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.canvas(classes : Set<String>? = null, block : CANVAS.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildCANVAS, block).finalize()

public fun <T, C : TagConsumer<T>> C.caption(classes : Set<String>? = null, block : CAPTION.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildCAPTION, block).finalize()

public fun <T, C : TagConsumer<T>> C.cite(classes : Set<String>? = null, block : CITE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildCITE, block).finalize()

public fun <T, C : TagConsumer<T>> C.code(classes : Set<String>? = null, block : CODE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildCODE, block).finalize()

public fun <T, C : TagConsumer<T>> C.col(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildCOL, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.col(classes : Set<String>? = null, block : COL.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildCOL, block).finalize()

public fun <T, C : TagConsumer<T>> C.colGroup(classes : Set<String>? = null, block : COLGROUP.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildCOLGROUP, block).finalize()

public fun <T, C : TagConsumer<T>> C.command(type : CommandType? = null, classes : Set<String>? = null, content : String = "") : T = build(listOf("type" to type?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildCOMMAND, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.command(type : CommandType? = null, classes : Set<String>? = null, block : COMMAND.() -> Unit) : T = build(listOf("type" to type?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildCOMMAND, block).finalize()

public fun <T, C : TagConsumer<T>> C.dataList(classes : Set<String>? = null, block : DATALIST.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDATALIST, block).finalize()

public fun <T, C : TagConsumer<T>> C.dd(classes : Set<String>? = null, block : DD.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDD, block).finalize()

public fun <T, C : TagConsumer<T>> C.del(classes : Set<String>? = null, block : DEL.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDEL, block).finalize()

public fun <T, C : TagConsumer<T>> C.details(classes : Set<String>? = null, block : DETAILS.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDETAILS, block).finalize()

public fun <T, C : TagConsumer<T>> C.dfn(classes : Set<String>? = null, block : DFN.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDFN, block).finalize()

public fun <T, C : TagConsumer<T>> C.dialog(classes : Set<String>? = null, block : DIALOG.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDIALOG, block).finalize()

public fun <T, C : TagConsumer<T>> C.div(classes : Set<String>? = null, block : DIV.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDIV, block).finalize()

public fun <T, C : TagConsumer<T>> C.dl(classes : Set<String>? = null, block : DL.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDL, block).finalize()

public fun <T, C : TagConsumer<T>> C.dt(classes : Set<String>? = null, block : DT.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildDT, block).finalize()

public fun <T, C : TagConsumer<T>> C.em(classes : Set<String>? = null, block : EM.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildEM, block).finalize()

public fun <T, C : TagConsumer<T>> C.embed(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildEMBED, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.embed(classes : Set<String>? = null, block : EMBED.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildEMBED, block).finalize()

public fun <T, C : TagConsumer<T>> C.fieldSet(classes : Set<String>? = null, block : FIELDSET.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildFIELDSET, block).finalize()

public fun <T, C : TagConsumer<T>> C.figure(classes : Set<String>? = null, block : FIGURE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildFIGURE, block).finalize()

public fun <T, C : TagConsumer<T>> C.footer(classes : Set<String>? = null, block : FOOTER.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildFOOTER, block).finalize()

public fun <T, C : TagConsumer<T>> C.form(action : String? = null, encType : FormEncType? = null, method : FormMethod? = null, classes : Set<String>? = null, block : FORM.() -> Unit) : T = build(listOf("action" to action,"enctype" to encType?.enumEncode(),"method" to method?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildFORM, block).finalize()

public fun <T, C : TagConsumer<T>> C.h1(classes : Set<String>? = null, block : H1.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildH1, block).finalize()

public fun <T, C : TagConsumer<T>> C.h2(classes : Set<String>? = null, block : H2.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildH2, block).finalize()

public fun <T, C : TagConsumer<T>> C.h3(classes : Set<String>? = null, block : H3.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildH3, block).finalize()

public fun <T, C : TagConsumer<T>> C.h4(classes : Set<String>? = null, block : H4.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildH4, block).finalize()

public fun <T, C : TagConsumer<T>> C.h5(classes : Set<String>? = null, block : H5.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildH5, block).finalize()

public fun <T, C : TagConsumer<T>> C.h6(classes : Set<String>? = null, block : H6.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildH6, block).finalize()

public fun <T, C : TagConsumer<T>> C.head(classes : Set<String>? = null, block : HEAD.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildHEAD, block).finalize()

public fun <T, C : TagConsumer<T>> C.header(classes : Set<String>? = null, block : HEADER.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildHEADER, block).finalize()

public fun <T, C : TagConsumer<T>> C.hGroup(classes : Set<String>? = null, block : HGROUP.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildHGROUP, block).finalize()

public fun <T, C : TagConsumer<T>> C.hr(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildHR, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.hr(classes : Set<String>? = null, block : HR.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildHR, block).finalize()

public fun <T, C : TagConsumer<T>> C.html(classes : Set<String>? = null, block : HTML.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildHTML, block).finalize()

public fun <T, C : TagConsumer<T>> C.i(classes : Set<String>? = null, block : I.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildI, block).finalize()

public fun <T, C : TagConsumer<T>> C.iframe(sandbox : IframeSandbox? = null, classes : Set<String>? = null, content : String = "") : T = build(listOf("sandbox" to sandbox?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildIFRAME, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.iframe(sandbox : IframeSandbox? = null, classes : Set<String>? = null, block : IFRAME.() -> Unit) : T = build(listOf("sandbox" to sandbox?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildIFRAME, block).finalize()

public fun <T, C : TagConsumer<T>> C.img(alt : String? = null, src : String? = null, classes : Set<String>? = null, content : String = "") : T = build(listOf("alt" to alt,"src" to src,"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildIMG, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.img(alt : String? = null, src : String? = null, classes : Set<String>? = null, block : IMG.() -> Unit) : T = build(listOf("alt" to alt,"src" to src,"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildIMG, block).finalize()

public fun <T, C : TagConsumer<T>> C.input(type : InputType? = null, formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : Set<String>? = null, content : String = "") : T = build(listOf("type" to type?.enumEncode(),"formenctype" to formEncType?.enumEncode(),"formmethod" to formMethod?.enumEncode(),"name" to name,"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildINPUT, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.input(type : InputType? = null, formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : Set<String>? = null, block : INPUT.() -> Unit) : T = build(listOf("type" to type?.enumEncode(),"formenctype" to formEncType?.enumEncode(),"formmethod" to formMethod?.enumEncode(),"name" to name,"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildINPUT, block).finalize()

public fun <T, C : TagConsumer<T>> C.ins(classes : Set<String>? = null, block : INS.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildINS, block).finalize()

public fun <T, C : TagConsumer<T>> C.kbd(classes : Set<String>? = null, block : KBD.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildKBD, block).finalize()

public fun <T, C : TagConsumer<T>> C.keyGen(keyType : KeyGenKeyType? = null, classes : Set<String>? = null, content : String = "") : T = build(listOf("keytype" to keyType?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildKEYGEN, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.keyGen(keyType : KeyGenKeyType? = null, classes : Set<String>? = null, block : KEYGEN.() -> Unit) : T = build(listOf("keytype" to keyType?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildKEYGEN, block).finalize()

public fun <T, C : TagConsumer<T>> C.label(classes : Set<String>? = null, block : LABEL.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildLABEL, block).finalize()

public fun <T, C : TagConsumer<T>> C.legEnd(classes : Set<String>? = null, block : LEGEND.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildLEGEND, block).finalize()

public fun <T, C : TagConsumer<T>> C.li(classes : Set<String>? = null, block : LI.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildLI, block).finalize()

public fun <T, C : TagConsumer<T>> C.link(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildLINK, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.link(classes : Set<String>? = null, block : LINK.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildLINK, block).finalize()

public fun <T, C : TagConsumer<T>> C.map(name : String? = null, classes : Set<String>? = null, block : MAP.() -> Unit) : T = build(listOf("name" to name,"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildMAP, block).finalize()

public fun <T, C : TagConsumer<T>> C.mark(classes : Set<String>? = null, block : MARK.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildMARK, block).finalize()

public fun <T, C : TagConsumer<T>> C.math(classes : Set<String>? = null, block : MATH.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildMATH, block).finalize()

public fun <T, C : TagConsumer<T>> C.mathml(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildMATHML, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.mathml(classes : Set<String>? = null, block : MATHML.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildMATHML, block).finalize()

public fun <T, C : TagConsumer<T>> C.menu(type : MenuType? = null, classes : Set<String>? = null, block : MENU.() -> Unit) : T = build(listOf("type" to type?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildMENU, block).finalize()

public fun <T, C : TagConsumer<T>> C.meta(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildMETA, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.meta(classes : Set<String>? = null, block : META.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildMETA, block).finalize()

public fun <T, C : TagConsumer<T>> C.meter(classes : Set<String>? = null, block : METER.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildMETER, block).finalize()

public fun <T, C : TagConsumer<T>> C.nav(classes : Set<String>? = null, block : NAV.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildNAV, block).finalize()

public fun <T, C : TagConsumer<T>> C.noScript(classes : Set<String>? = null, block : NOSCRIPT.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildNOSCRIPT, block).finalize()

public fun <T, C : TagConsumer<T>> C.object_(classes : Set<String>? = null, block : OBJECT_.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildOBJECT_, block).finalize()

public fun <T, C : TagConsumer<T>> C.ol(classes : Set<String>? = null, block : OL.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildOL, block).finalize()

public fun <T, C : TagConsumer<T>> C.optGroup(label : String? = null, classes : Set<String>? = null, block : OPTGROUP.() -> Unit) : T = build(listOf("label" to label,"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildOPTGROUP, block).finalize()

public fun <T, C : TagConsumer<T>> C.option(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildOPTION, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.option(classes : Set<String>? = null, block : OPTION.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildOPTION, block).finalize()

public fun <T, C : TagConsumer<T>> C.output(classes : Set<String>? = null, block : OUTPUT.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildOUTPUT, block).finalize()

public fun <T, C : TagConsumer<T>> C.p(classes : Set<String>? = null, block : P.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildP, block).finalize()

public fun <T, C : TagConsumer<T>> C.param(name : String? = null, value : String? = null, content : String = "") : T = build(listOf("name" to name,"value" to value).toAttributesMap(), ::buildPARAM, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.param(name : String? = null, value : String? = null, block : PARAM.() -> Unit) : T = build(listOf("name" to name,"value" to value).toAttributesMap(), ::buildPARAM, block).finalize()

public fun <T, C : TagConsumer<T>> C.pre(classes : Set<String>? = null, block : PRE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildPRE, block).finalize()

public fun <T, C : TagConsumer<T>> C.progress(classes : Set<String>? = null, block : PROGRESS.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildPROGRESS, block).finalize()

public fun <T, C : TagConsumer<T>> C.q(classes : Set<String>? = null, block : Q.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildQ, block).finalize()

public fun <T, C : TagConsumer<T>> C.rp(classes : Set<String>? = null, block : RP.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildRP, block).finalize()

public fun <T, C : TagConsumer<T>> C.rt(classes : Set<String>? = null, block : RT.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildRT, block).finalize()

public fun <T, C : TagConsumer<T>> C.ruby(classes : Set<String>? = null, block : RUBY.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildRUBY, block).finalize()

public fun <T, C : TagConsumer<T>> C.samp(classes : Set<String>? = null, block : SAMP.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSAMP, block).finalize()

public fun <T, C : TagConsumer<T>> C.script(type : ScriptType? = null, src : String? = null, content : String = "") : T = build(listOf("type" to type?.enumEncode(),"src" to src).toAttributesMap(), ::buildSCRIPT, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.script(type : ScriptType? = null, src : String? = null, block : SCRIPT.() -> Unit) : T = build(listOf("type" to type?.enumEncode(),"src" to src).toAttributesMap(), ::buildSCRIPT, block).finalize()

public fun <T, C : TagConsumer<T>> C.section(classes : Set<String>? = null, block : SECTION.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSECTION, block).finalize()

public fun <T, C : TagConsumer<T>> C.select(classes : Set<String>? = null, block : SELECT.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSELECT, block).finalize()

public fun <T, C : TagConsumer<T>> C.small(classes : Set<String>? = null, block : SMALL.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSMALL, block).finalize()

public fun <T, C : TagConsumer<T>> C.source(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSOURCE, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.source(classes : Set<String>? = null, block : SOURCE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSOURCE, block).finalize()

public fun <T, C : TagConsumer<T>> C.span(classes : Set<String>? = null, block : SPAN.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSPAN, block).finalize()

public fun <T, C : TagConsumer<T>> C.strong(classes : Set<String>? = null, block : STRONG.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSTRONG, block).finalize()

public fun <T, C : TagConsumer<T>> C.style(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSTYLE, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.style(classes : Set<String>? = null, block : STYLE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSTYLE, block).finalize()

public fun <T, C : TagConsumer<T>> C.sub(classes : Set<String>? = null, block : SUB.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSUB, block).finalize()

public fun <T, C : TagConsumer<T>> C.sup(classes : Set<String>? = null, block : SUP.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSUP, block).finalize()

public fun <T, C : TagConsumer<T>> C.svg(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSVG, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.svg(classes : Set<String>? = null, block : SVG.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildSVG, block).finalize()

public fun <T, C : TagConsumer<T>> C.table(classes : Set<String>? = null, block : TABLE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTABLE, block).finalize()

public fun <T, C : TagConsumer<T>> C.tbody(classes : Set<String>? = null, block : TBODY.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTBODY, block).finalize()

public fun <T, C : TagConsumer<T>> C.td(classes : Set<String>? = null, block : TD.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTD, block).finalize()

public fun <T, C : TagConsumer<T>> C.textArea(rows : String? = null, cols : String? = null, wrap : TextAreaWrap? = null, classes : Set<String>? = null, content : String = "") : T = build(listOf("rows" to rows,"cols" to cols,"wrap" to wrap?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTEXTAREA, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.textArea(rows : String? = null, cols : String? = null, wrap : TextAreaWrap? = null, classes : Set<String>? = null, block : TEXTAREA.() -> Unit) : T = build(listOf("rows" to rows,"cols" to cols,"wrap" to wrap?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTEXTAREA, block).finalize()

public fun <T, C : TagConsumer<T>> C.tfoot(classes : Set<String>? = null, block : TFOOT.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTFOOT, block).finalize()

public fun <T, C : TagConsumer<T>> C.th(scope : ThScope? = null, classes : Set<String>? = null, block : TH.() -> Unit) : T = build(listOf("scope" to scope?.enumEncode(),"class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTH, block).finalize()

public fun <T, C : TagConsumer<T>> C.thead(classes : Set<String>? = null, block : THEAD.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTHEAD, block).finalize()

public fun <T, C : TagConsumer<T>> C.time(classes : Set<String>? = null, block : TIME.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTIME, block).finalize()

public fun <T, C : TagConsumer<T>> C.title(classes : Set<String>? = null, content : String = "") : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTITLE, {+content}).finalize()
public fun <T, C : TagConsumer<T>> C.title(classes : Set<String>? = null, block : TITLE.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTITLE, block).finalize()

public fun <T, C : TagConsumer<T>> C.tr(classes : Set<String>? = null, block : TR.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildTR, block).finalize()

public fun <T, C : TagConsumer<T>> C.ul(classes : Set<String>? = null, block : UL.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildUL, block).finalize()

public fun <T, C : TagConsumer<T>> C.var_(classes : Set<String>? = null, block : VAR_.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildVAR_, block).finalize()

public fun <T, C : TagConsumer<T>> C.video(classes : Set<String>? = null, block : VIDEO.() -> Unit) : T = build(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), ::buildVIDEO, block).finalize()

