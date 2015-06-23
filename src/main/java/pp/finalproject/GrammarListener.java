// Generated from E:/michiel/Documents/GitHub/PP-Final-Project/src/main/java/pp/finalproject\Grammar.g4 by ANTLR 4.5
package pp.finalproject;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sharedDeclStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterSharedDeclStat(@NotNull GrammarParser.SharedDeclStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sharedDeclStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitSharedDeclStat(@NotNull GrammarParser.SharedDeclStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclStat(@NotNull GrammarParser.DeclStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclStat(@NotNull GrammarParser.DeclStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(@NotNull GrammarParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(@NotNull GrammarParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(@NotNull GrammarParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(@NotNull GrammarParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(@NotNull GrammarParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(@NotNull GrammarParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procedureStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStat(@NotNull GrammarParser.ProcedureStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procedureStat}
	 * labeled alternative in {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStat(@NotNull GrammarParser.ProcedureStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(@NotNull GrammarParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(@NotNull GrammarParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void enterArraytype(@NotNull GrammarParser.ArraytypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void exitArraytype(@NotNull GrammarParser.ArraytypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noParamProcedure}
	 * labeled alternative in {@link GrammarParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterNoParamProcedure(@NotNull GrammarParser.NoParamProcedureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noParamProcedure}
	 * labeled alternative in {@link GrammarParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitNoParamProcedure(@NotNull GrammarParser.NoParamProcedureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramProcedure}
	 * labeled alternative in {@link GrammarParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterParamProcedure(@NotNull GrammarParser.ParamProcedureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramProcedure}
	 * labeled alternative in {@link GrammarParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitParamProcedure(@NotNull GrammarParser.ParamProcedureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull GrammarParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull GrammarParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(@NotNull GrammarParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(@NotNull GrammarParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timesDivideExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTimesDivideExpr(@NotNull GrammarParser.TimesDivideExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timesDivideExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTimesDivideExpr(@NotNull GrammarParser.TimesDivideExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(@NotNull GrammarParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(@NotNull GrammarParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull GrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull GrammarParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(@NotNull GrammarParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(@NotNull GrammarParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(@NotNull GrammarParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(@NotNull GrammarParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(@NotNull GrammarParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(@NotNull GrammarParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull GrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull GrammarParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCmpExpr(@NotNull GrammarParser.CmpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCmpExpr(@NotNull GrammarParser.CmpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull GrammarParser.TypeContext ctx);
}