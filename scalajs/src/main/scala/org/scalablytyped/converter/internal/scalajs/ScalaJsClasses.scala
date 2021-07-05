package org.scalablytyped.converter.internal
package scalajs

object ScalaJsClasses {
  // this is generated by `ImportScalaDefinitions`
  val precomputed: IArray[Tree] =
    Json.forceResource[IArray[Tree]]("/scalajs-definitions.json")

  // format: off
  val Any =
    ClassTree(
      isImplicit = false,
      Empty,
      Name.Object,
      Empty,
      Empty,
      Empty,
      IArray(
        MethodTree(Empty, ProtectionLevel.Default, Name("getClass"), Empty, IArray(IArray()), ExprTree.native, TypeRef(QualifiedName(IArray(Name.java, Name.lang, Name("Class"))), IArray(TypeRef.Wildcard), NoComments), isOverride = false, NoComments, QualifiedName.Any + Name("getClass"), false),
        MethodTree(Empty, ProtectionLevel.Default, Name("hashCode"), Empty, IArray(IArray()), ExprTree.native, TypeRef.Int, isOverride = false, NoComments, QualifiedName.Any + Name("hashCode"), false),
        MethodTree(Empty, ProtectionLevel.Default, Name("eq"), Empty, IArray(IArray(ParamTree(Name("obj"), isImplicit = false, isVal = false, TypeRef.Any, NotImplemented, NoComments))), ExprTree.native, TypeRef.Int, isOverride = false, NoComments, QualifiedName.Any + Name("eq"), false),
        MethodTree(Empty, ProtectionLevel.Default, Name("equals"), Empty, IArray(IArray(ParamTree(Name("obj"), isImplicit = false, isVal = false, TypeRef.Any, NotImplemented, NoComments))), ExprTree.native, TypeRef.Int, isOverride = false, NoComments, QualifiedName.Any + Name("equals"), false),
        MethodTree(Empty, ProtectionLevel.Default, Name("toString"), Empty, IArray(IArray()), ExprTree.native, TypeRef.String, isOverride = false, NoComments, QualifiedName.Any + Name("toString"), false),
        MethodTree(Empty, ProtectionLevel.Default, Name("ne"), Empty, IArray(IArray(ParamTree(Name("obj"), isImplicit = false, isVal = false, TypeRef.Any, NotImplemented, NoComments))), ExprTree.native, TypeRef.Int, isOverride = false, NoComments, QualifiedName.Any + Name("ne"), false),
        MethodTree(Empty, ProtectionLevel.Default, Name("notify"), Empty, IArray(IArray()), ExprTree.native, TypeRef.Unit, isOverride = false, NoComments, QualifiedName.Any + Name("notify"), false),
        MethodTree(Empty, ProtectionLevel.Default, Name("notifyAll"), Empty, IArray(IArray()), ExprTree.native, TypeRef.Unit, isOverride = false, NoComments, QualifiedName.Any + Name("notifyAll"), false),
        MethodTree(Empty, ProtectionLevel.Default, Name("wait"), Empty, IArray(IArray()), ExprTree.native, TypeRef.Unit, isOverride = false, NoComments, QualifiedName.Any + Name("wait"), false),
        MethodTree(Empty, ProtectionLevel.Default, Name("wait"), Empty, IArray(IArray(ParamTree(Name("timeout"), isImplicit = false, isVal = false, TypeRef.Long, NotImplemented, NoComments))), ExprTree.native, TypeRef.Unit, isOverride = false, NoComments, QualifiedName.Any + Name("wait"), false),
        MethodTree(Empty, ProtectionLevel.Default, Name("wait"), Empty, IArray(IArray(ParamTree(Name("timeout"), isImplicit = false, isVal = false, TypeRef.Long, NotImplemented, NoComments), ParamTree(Name("nanos"), isImplicit = false, isVal = false, TypeRef.Int, NotImplemented, NoComments))), ExprTree.native, TypeRef.Unit, isOverride = false, NoComments, QualifiedName.Any + Name("wait"), false),
        MethodTree(Empty, ProtectionLevel.Protected, Name("clone"), Empty, IArray(IArray()), ExprTree.native, TypeRef.Any, isOverride = false, NoComments, QualifiedName.Any + Name("clone"), false),
        MethodTree(Empty, ProtectionLevel.Protected, Name("finalize"), Empty, IArray(IArray()), ExprTree.native, TypeRef.Unit, isOverride = false, NoComments, QualifiedName.Any + Name("finalize"), false),
      ),
      ClassType.Class,
      isSealed = false,
      NoComments,
      QualifiedName.Any,
    )

  val hardcoded: IArray[ClassTree] = {
    def cls(cp: QualifiedName, parents: IArray[TypeRef], classType: ClassType, isSealed: Boolean) =
      ClassTree(false, Empty, cp.parts.last, Empty, parents, Empty, Empty, classType, isSealed, NoComments, cp)

    IArray(
        Any,
        cls(QualifiedName.AnyRef, IArray(TypeRef.Any), ClassType.Trait, isSealed     = false),
        cls(QualifiedName.AnyVal, IArray(TypeRef.Any), ClassType.Trait, isSealed     = false),
        cls(QualifiedName.Boolean, IArray(TypeRef.AnyVal), ClassType.Class, isSealed = true),
        cls(QualifiedName.Byte, IArray(TypeRef.AnyVal), ClassType.Class, isSealed  = true),
        cls(QualifiedName.Double, IArray(TypeRef.AnyVal), ClassType.Class, isSealed  = true),
        cls(QualifiedName("scala.Error"), IArray(TypeRef.AnyRef), ClassType.Class, isSealed  = true),
        cls(QualifiedName.Float, IArray(TypeRef.AnyVal), ClassType.Class, isSealed  = true),
        cls(QualifiedName.Int, IArray(TypeRef.AnyVal), ClassType.Class, isSealed     = true),
        cls(QualifiedName.Long, IArray(TypeRef.AnyVal), ClassType.Class, isSealed     = true),
        cls(QualifiedName.Nothing, IArray(TypeRef.JsAny), ClassType.Class, isSealed  = true),
        cls(QualifiedName.Null, IArray(TypeRef.AnyRef), ClassType.Trait, isSealed    = false),
        cls(QualifiedName.Short, IArray(TypeRef.AnyVal), ClassType.Class, isSealed  = true),
        cls(QualifiedName.String, IArray(TypeRef.AnyRef), ClassType.Class, isSealed  = true),
        cls(QualifiedName.Unit, IArray(TypeRef.AnyVal), ClassType.Class, isSealed    = true),
        cls(QualifiedName.JsAny, IArray(TypeRef.AnyRef), ClassType.Trait, isSealed   = false),
    )
  }

  val ScalaJsTypes: Map[QualifiedName, Tree] =
    (precomputed ++ hardcoded).collect { case x: Tree with HasCodePath => x.codePath -> x }.toMap

  val jsObjectMembers: IArray[Tree] = {
    IArray(
      Any,
      ScalaJsTypes(QualifiedName.JsObject),
    ).collect { case x: ClassTree => x.members }.flatten
  }

  val jsObjectMembersByName: Map[Name, IArray[Tree]] =
    jsObjectMembers.groupBy(_.name)
}
