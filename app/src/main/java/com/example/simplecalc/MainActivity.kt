package com.example.simplecalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    val TAG: String = "CalculatorActivity"

    lateinit var mCalculator: Calculator
    lateinit var mOperandOneEditText: EditText
    lateinit var mOperandTwoEditText: EditText
    lateinit var mResultTextView: TextView

    lateinit var btnsum: Button
    lateinit var btnsub: Button
    lateinit var btndiv: Button
    lateinit var btnmul: Button
    lateinit var btnpow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mCalculator = Calculator()
        mResultTextView = findViewById(R.id.operation_result_text_view)
        mOperandOneEditText = findViewById(R.id.operand_one_edit_text)
        mOperandTwoEditText = findViewById(R.id.operand_two_edit_text)

        btnsum = findViewById(R.id.operation_add_btn)
        btnsub = findViewById(R.id.operation_sub_btn)
        btndiv = findViewById(R.id.operation_div_btn)
        btnmul = findViewById(R.id.operation_mul_btn)
        btnpow = findViewById(R.id.operation_pow_btn)


        btnsum.setOnClickListener {
            onAdd()
        }

        btnsub.setOnClickListener {
            onSub()
        }

        btndiv.setOnClickListener {
            onDiv()
        }

        btnmul.setOnClickListener {
            onMul()
        }

        btnpow.setOnClickListener {
            onPow()
        }


    }

    fun onAdd(){
        compute(Calculator.Operator.ADD)
    }
    fun onSub(){
        compute(Calculator.Operator.SUB)
    }
    fun onDiv(){
        compute(Calculator.Operator.DIV)
    }
    fun onMul(){
        compute(Calculator.Operator.MUL)
    }
    fun onPow(){
        compute(Calculator.Operator.POW)
    }

    fun compute(operator: Calculator.Operator){
        var operandOne: Double = getOperand(mOperandOneEditText)
        var operandTwo: Double = getOperand(mOperandTwoEditText)

        var result:String

        when(operator){
            Calculator.Operator.ADD -> result = mCalculator.add(operandOne,operandTwo).toString()
            Calculator.Operator.SUB -> result = mCalculator.sub(operandOne,operandTwo).toString()
            Calculator.Operator.DIV -> result = mCalculator.div(operandOne,operandTwo).toString()
            Calculator.Operator.MUL -> result = mCalculator.mul(operandOne,operandTwo).toString()
            Calculator.Operator.POW -> result = mCalculator.pow(operandOne,operandTwo).toString()
        }

        mResultTextView.text = result


    }

    fun getOperand(operandEditText: EditText): Double{
        val operandText: String = getOperandText(operandEditText)
        return operandText.toDouble()
    }

    fun getOperandText(operandEditText: EditText): String{
        return operandEditText.text.toString()
    }

}
