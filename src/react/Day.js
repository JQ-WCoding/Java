import {Component} from 'react';
import ReactDom from 'react-dom';

const user = {
    firstName: 'John',
    lastName : 'Lee',
};

function today() {
    let year = new Date().getFullYear;
    let month = new Date().getMonth + 1;
    let day = new Date().getDate;

    return year + ' / ' + month + ' / ' + day;
}

class Day extends Component {
    render() {
        return <div>
            <h1>Hello, { user.firstName }{ user.lastName }</h1>
            <h4>Today : { today() }</h4>
        </div>;
    }
}

ReactDom.render(
    <Day/>,
    document.getElementById('root'),
);