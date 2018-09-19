import React,{Component} from 'react'
import SignUpForm from './SignUpForm'

export default class Registration extends Component{

    onSubmitClick   =   ()  =>{
        const First_name = document.getElementById("name").value;
        alert(`${First_name} added`);
    }
    render(){
        return(
                <div>
                    <SignUpForm onSubmitClick={this.onSubmitClick}></SignUpForm>
                   
                </div>
        )
    }
}