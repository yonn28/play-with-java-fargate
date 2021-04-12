from flask import Flask, escape, request, jsonify, render_template
import requests
import os

app = Flask(__name__)

my_nasa_api_link = 'https://api.nasa.gov/planetary/apod?api_key=Ud1itEy4pRcrIl0ZZw9GjkryL7R63Uai1igEnaxd'


@app.route('/')
def index():
    r = requests.get(my_nasa_api_link)
    response = r.json()

    copy_right_text = 'Image Credits:'

    if 'copyright' in response:
        copy_right_text = response['copyright']
    else:
        copy_right_text = 'Public domain'

    description_text = response.get('explanation','No description')
    title_text = response.get('title')

    media_type = response['media_type']
    hdurl = response['url']
    date = response['date']


    return render_template('index.html',
                            copy_right_text = copy_right_text,
                            description_text = description_text ,
                            title_text=title_text,
                            media_type=media_type,
                            hdurl = hdurl,
                            date = date
                            )




if __name__ == "__main__":
    app.run(debug=True, port=5000)