import {Component} from 'react';
import ReactDom from 'react-dom';

const user = {
    firstName: 'John',
    lastName : 'Lee',
    city     : 'Seoul',
};

function today() {
    let year = new Date().getFullYear;
    let month = new Date().getMonth + 1;
    let day = new Date().getDate;

    return year + ' / ' + month + ' / ' + day;
}

const sample = {
    test1: 'test',
    test2: 'test2'
}

class Day extends Component {
    render() {
        return <div>
            <h1>Hello, {user.firstName}{user.lastName}</h1>
            <h4>Today : {today()}</h4>
            <h5>{user.city}</h5>

            <div>{sample.test1} AND {sample.test2}</div>
        </div>;
    }
}

ReactDom.render(
    <Day/>,
    document.getElementById( 'root' ),
);